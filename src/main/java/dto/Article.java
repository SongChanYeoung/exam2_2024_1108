package dto;

public class Article {
    public int id;
    public String regDate;
    public String title;
    public String body;

    public Article(int id, String regDate, String title, String body) {
        this.id = id;
        this.regDate = regDate;
        this.title = title;
        this.body = body;
    }
}