/*import java.util.ArrayList;
import java.util.List;*/

public class Main1105 {
    public static void main(String[] args) {

        /*Article[] articles = new Article[10000];
        articles[0] = new Article(1, "2024-12-12");
        articles[1] = new Article();
        articles[2] = new Article();
        articles[3] = new Article();
        articles[4] = new Article();


        for ( int i = 0; i< articles.length; i++) {
            System.out.println(articles[i].id);



        }
    }
}
class Article {
    static int lastId = 0;
    int id;
    String regDate;

    Article() {
        this(lastId + 1, "2024-12-12");
        lastId++;
    }
    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }
}
*/
        /*Article[] articles = new Article[4];

        articles[0] = new Article();
        articles[1] = new Article();
        articles[2] = new Article();
        articles[3] = new Article();

        System.out.println(articles[0].id);
        System.out.println(articles[1].id);
        System.out.println(articles[2].id);
        System.out.println(articles[3].id);
    }
}

class Article {
    static int lastId;
    int id;
    String regDate;

    static {
        lastId = 0;
    }
    Article() {
        this(lastId + 1, "2020-12-12");
        lastId++;
    }
    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;*/
       /* //exam01();
        //exam02();
        //exam03();
        exam04();
    }
    static void exam04() {
        List<Article> article = new ArrayList();

        articles.add(new Article());
        articles
                .add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);

            System.out.println(article.id);
        }
    }
    static void exam03() {
        ArrayList<Article> articles = new ArrayList();

        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for ( int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);

            System.out.println(article.id);
        }
    }
    static void exam02() {
        ArrayList articles = new ArrayList();

        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());

        for ( int i = 0; i < articles.size(); i++) {
            Article article = (Article) articles.get(i);

            System.out.println(article.id);
        }
    }

    static void exam01() {
        Article[] articles = new Article[1000];

        int articlesSize = 0;

        articles[0] = new Article();
        articlesSize++;

        articles[1] = new Article();
        articlesSize++;

        articles[2] = new Article();
        articlesSize++;

        articles[3] = new Article();
        articlesSize++;

        articles[4] = new Article();
        articlesSize++;

        for ( int i = 0; i < articlesSize; i++) {
            System.out.println(articles[i].id);
        }
    }
}

class Article {
    static int lastId;
    int id;
    String regDate;

    static {
        lastId = 0;
    }
    Article() {
        this(lastId + 1, "2020-12-12");
        lastId++;
    }
    Article(int id, String regDate) {
        this.id = id;
        this.regDate = regDate;
    }
}*/
        /*ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        
        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300
    }
}

class ArrayList {
    int[] datas;
    int lastIndex;
    
    ArrayList() {
        datas = new int[3];
        lastIndex = -1;
    }
    
    void add(int value) {
        lastIndex++;
        datas[lastIndex] = value;
    }
    
    int get(int index) {
        int intdex;
        return datas[index];
    }
}*/
    }
}