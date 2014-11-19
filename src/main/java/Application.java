import hibernate.DatabaseHandler;
import objects.ExampleObject;

public class Application
{
	public static void main(String[] args)
	{
		DatabaseHandler handler = new DatabaseHandler();

		ExampleObject input = new ExampleObject();
		input.setId(3l);
		input.setName("Name");

		handler.save(input);

		ExampleObject response = (ExampleObject) handler.get(3l);

		System.out.println("======== Saved ========");
		System.out.println(input);
		System.out.println("======== Loaded ========");
		System.out.println(response);

		handler.close();
	}
}
