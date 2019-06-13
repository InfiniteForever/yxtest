package group.yunxin.pojo;

public class TbTkQues
{
	private Long quesId;
	private TbQues ques;

	private Integer numBlanks;

	public Long getQuesId()
	{
		return quesId;
	}

	public void setQuesId(Long quesId)
	{
		this.quesId = quesId;
	}

	public Integer getNumBlanks()
	{
		return numBlanks;
	}

	public void setNumBlanks(Integer numBlanks)
	{
		this.numBlanks = numBlanks;
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