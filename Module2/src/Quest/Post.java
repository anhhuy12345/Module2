package Quest;

public class Post {
    private String id;
    private  String title;
    private  String subTitle;
    private String content;
    private String views;

    public Post(){}

    public Post(String id, String title, String subTitle, String content, String views){
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this. views = views;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getContent() {
        return content;
    }

    public String getViews() {
        return views;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", content='" + content + '\'' +
                ", views='" + views + '\'' +
                '}';
    }
}
