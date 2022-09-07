package builder;

public class Demo {
	public static void main(String args[]) {

		Blog blog = new BlogBuilder(5).setDescription("Hello").setSummary("Test").build();

		System.out.println("blog> blogid:"+blog.getId()+" blog Summary "+blog.getSummary());

	}
}
