package objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "example_object")
public class ExampleObject
{
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	public ExampleObject()
	{
		setId(-1);
		setName("");
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		String string = "{";
		string += "\"id\": " + getId() + ", ";
		string += "\"name\": \"" + getName() + "\"";
		string += "}";
		return string;
	}
}
