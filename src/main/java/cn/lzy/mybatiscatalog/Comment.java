package cn.lzy.mybatiscatalog;

public class Comment {
    private Integer id;
    private String content;
    private String author;
    private Integer aId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getA_id() {
        return aId;
    }

    public void setA_id(Integer a_id) {
        this.aId = a_id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", a_id=" + aId +
                '}';
    }
}
