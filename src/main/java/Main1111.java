/*
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Main1111 {
    public static void main(String[] args) {

        class Article {
            int number;
            String date;
            String title;
            String content;

            public Article(int number, String title, String content) {
                this.number = number;
                this.date = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss").format(new Date());
                this.title = title;
                this.content = content;
            }

            @Override
            public String toString() {
                return "번호: " + number + "\n날짜: " + date + "\n제목: " + title + "\n내용: " + content;
            }
        }

        class ArticleManager {
            private static int articleCount = 1;  // 게시물 번호가 1부터 시작되도록 설정
            private static final HashMap<Integer, Article> articles = new HashMap<>();

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.print("명령어) ");
                    String command = scanner.nextLine();
                    String[] parts = command.split(" ");

                    if (parts.length < 2) {
                        System.out.println("잘못된 명령어 형식입니다.");
                        continue;
                    }

                    String action = parts[1];
                    if (action.equals("detail") || action.equals("delete")) {
                        if (parts.length < 3) {
                            System.out.println("번호가 필요합니다.");
                            continue;
                        }

                        int articleNum = Integer.parseInt(parts[2]);
                        if (action.equals("detail")) {
                            showArticleDetail(articleNum);
                        } else if (action.equals("delete")) {
                            deleteArticle(articleNum);
                        }
                    } else if (action.equals("write")) {
                        writeArticle(scanner);
                    } else {
                        System.out.println("알 수 없는 명령어입니다.");
                    }
                }
            }

            private static void showArticleDetail(int number) {
                if (articles.containsKey(number)) {
                    System.out.println(articles.get(number).toString());
                } else {
                    System.out.println(number + "번 게시물은 존재하지 않습니다.");
                }
            }

            private static void deleteArticle(int number) {
                if (articles.containsKey(number)) {
                    articles.remove(number);
                    System.out.println(number + "번 게시물이 삭제되었습니다.");
                } else {
                    System.out.println(number + "번 게시물은 존재하지 않습니다.");
                }
            }

            private static void writeArticle(Scanner scanner) {
                System.out.print("제목: ");
                String title = scanner.nextLine();
                System.out.print("내용: ");
                String content = scanner.nextLine();
                articles.put(articleCount, new Article(articleCount, title, content));
                System.out.println(articleCount + "번 게시물이 작성되었습니다.");
                articleCount++;
            }
        }
    }
}*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main1111 {
    public static void main(String[] args) {
        System.out.println("== 프로그램 시작 ==");

        Scanner sc = new Scanner(System.in);

        int lastArticleId = 0;

        List<Article> articles = new ArrayList<>();
        while ( true ) {
            System.out.printf("명령어) ");
            String command = sc.nextLine();
            command = command.trim();

            if ( command.length() == 0 ) {
                continue;
            }

            if ( command.equals("exit") ) {
                break;
            }
            else if ( command.equals("article list")) {
                System.out.println("게시글이 없습니다.");
                if ( articles.size() == 0 ) {
                    System.out.println("게시글이 없습니다.");
                    continue;
                }
                System.out.println("번호, 제목, 내용");
                for ( int i = 0; i < articles.size(); i++ ) {
                    Article article = articles.get(i);
                    System.out.printf("%d, %s, %s\n", article.id, article.title, article.body);
                }
            }
            else if ( command.equals("article write")) {
                int id = lastArticleId + 1;
                System.out.printf("제목 : ");
                String title = sc.nextLine();
                System.out.printf("내용 : ");
                String body = sc.nextLine();

                Article article = new Article(id, title, body);
                articles.add(article);
                lastArticleId = id;

                System.out.printf("%d번 글이 생성되었습니다.\n", id);
            }
            else {
                System.out.printf("%s(은)는 존재하지 않는 명령어 입니다.\n", command);
            }

        }

        sc.close();
        System.out.println("== 프로그램 끝 ==");
    }
}
class Article {
    int id;
    String title;
    String body;
    public Article(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
}