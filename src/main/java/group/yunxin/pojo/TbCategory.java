package group.yunxin.pojo;

public class TbCategory
{
	private Long id;

	private String name;

	private Long fromId;
	
	private TbUser from;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name == null ? null : name.trim();
	}

	public Long getFromId()
	{
		return fromId;
	}

	public void setFromId(Long fromId)
	{
		this.fromId = fromId;
	}

	public TbUser getFrom()
	{
		return from;
	}

	public void setFrom(TbUser from)
	{
		this.from = from;
	}
}