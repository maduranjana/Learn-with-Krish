package builder;

import java.util.Date;

public class BlogBuilder {

	private final long id;
	private String summary = "";
	private String description = "";
	private boolean done = false;
	private Date editDate;

	public BlogBuilder(long id, String summary, String description, boolean done, Date editDate) {
		this.id = id;
		this.summary = summary;
		this.description = description;
		this.done = done;
		this.editDate = editDate;
	}

	public BlogBuilder(int id) {
		this.id = id;
		
	}

	public BlogBuilder setSummary(String summary) {
		this.summary = summary;
		return this;
	}

	public BlogBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	public BlogBuilder setDone(boolean done) {
		this.done = done;
		return this;
	}

	public BlogBuilder setDueDate(Date editDate) {
		this.editDate = new Date(editDate.getTime());
		return this;
	}

	public Blog build() {
		return new Blog(id, summary, description, done, editDate);
	}

}
