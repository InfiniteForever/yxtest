package group.yunxin.pojo;

public class TbClass
{
	private Long id;

	private String name;

	private String description;

	private Long teacherId;

	private TbUser teacher;
	
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

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description == null ? null : description.trim();
	}

	public Long getTeacherId()
	{
		return teacherId;
	}

	public void setTeacherId(Long teacherId)
	{
		this.teacherId = teacherId;
	}

	public TbUser getTeacher()
	{
		return teacher;
	}

	public void setTeacher(TbUser teacher)
	{
		this.teacher = teacher;
	}
}