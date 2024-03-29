package group.yunxin.utils;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/*
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.0.3</version>
</dependency>
*/
public class CommonRpc
{
	public static void main(String[] args)
	{
		DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI47dtSwoLzEUt", "SnxtBWE5LpE1Kq4sxh9mweu07CG8Iz");
		IAcsClient client = new DefaultAcsClient(profile);

		CommonRequest request = new CommonRequest();
		// request.setProtocol(ProtocolType.HTTPS);
		request.setMethod(MethodType.POST);
		request.setDomain("dysmsapi.aliyuncs.com");
		request.setVersion("2017-05-25");
		request.setAction("SendSms");
		request.putQueryParameter("RegionId", "cn-hangzhou");
		request.putQueryParameter("PhoneNumbers", "15524291036");
		request.putQueryParameter("SignName", "睿道新闻");
		request.putQueryParameter("TemplateCode", "SMS_165677804");
		request.putQueryParameter("TemplateParam", "{\"code\":\"121212\"}");
		try
		{
			CommonResponse response = client.getCommonResponse(request);
			System.out.println(response.getData());
		}
		catch (ServerException e)
		{
			e.printStackTrace();
		}
		catch (ClientException e)
		{
			e.printStackTrace();
		}
	}
}