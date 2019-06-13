package group.yunxin.pojo;

public class TbJdQues
{
	private Long quesId;

	private TbQues ques;

	private Integer minLength;

	private Integer maxLength;

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	public Integer getMinLength()
	{
		return minLength;
	}

	public void setMinLength(Integer minLength)
	{
		this.minLength = minLength;
	}

	public Integer getMaxLength()
	{
		return maxLength;
	}

	public void setMaxLength(Integer maxLength)
	{
		this.maxLength = maxLength;
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