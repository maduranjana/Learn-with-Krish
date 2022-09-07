package builder;

import java.util.Date;

public class Blog {
	
	private final long id;
    private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date editDate;

    public Blog(long id) {
        this.id = id;
    }

    public Blog(long id, String summary, String description, boolean done,
            Date editDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.editDate = editDate;

    }

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date geteditDate() {
        return new Date(editDate.getTime());
    }

    public void seteditDate(Date editDate) {
        this.editDate = new Date(editDate.getTime());
    }


}
