package group.yunxin.pojo;

public class TbPdQues
{
	private Long quesId;
	
	private TbQues ques;

	private String back;

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	public String getBack()
	{
		return back;
	}

	public void setBack(String back)
	{
		this.back = back == null ? null : back.trim();
	}

	public TbQues getQues()
	{
		return ques;
	}

	public void setQues(TbQues ques)
	{
		this.ques = ques;
	}
}