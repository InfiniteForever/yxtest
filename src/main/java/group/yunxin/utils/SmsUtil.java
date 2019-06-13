package group.yunxin.utils;

import java.util.Map;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class SmsUtil
{

	static public void sendSmsCode(String phone, String code) throws ServerException, ClientException
	{
		Map<String, String> map = PropertiesUtil.get("sms");
		DefaultProfile profile = DefaultProfile.getProfile(map.get("profile1"),
				map.get("profile2"), map.get("profile3"));
		IAcsClient client = new DefaultAcsClient(profile);
		CommonRequest request = new CommonRequest();
		request.setMethod(MethodType.POST);
		request.setDomain(map.get("domain"));
		request.setVersion(map.get("version"));
		request.setAction(map.get("action"));
		request.putQueryParameter("RegionId", map.get("regionId"));
		request.putQueryParameter("PhoneNumbers", phone);
		request.putQueryParameter("SignName", map.get("signName"));
		request.putQueryParameter("TemplateCode", map.get("templateCode"));
		request.putQueryParameter("TemplateParam", "{\"code\":\"" + code + "\"}");
		CommonResponse response = client.getCommonResponse(request);
		System.out.println(response.getData());
	}
	public static void main(String[] args) throws ServerException, ClientException
	{
		sendSmsCode("15524291036", "666666");
	}
}
