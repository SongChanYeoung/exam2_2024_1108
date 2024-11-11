import java.util.Scanner;

public class Main1108 {
    public static void main(String[] args) {
        System.out.println("== 프로그램 시작 ==");


        Scanner sc = new Scanner(System.in);
        int x = 1;

        while (true) {
            System.out.printf("명령어 )");
            String command = sc.nextLine();
            command.trim();

            if (command.length() == 0) {
                continue;
            }

            if ( command.equals("exit")) {
                break;
            }
            else if (command.equals("article list")){
                System.out.println("게시글이 없습니다.");
            }
            else if (command.equals("article write")){
                String title = sc.nextLine();
                String body = sc.nextLine();
                if (x == 1) {
                    title = "안녕";
                    body = "반가워";
                } else if (x == 2) {
                    title = "잘가";
                    body = "또 봐";
                } else {
                    title = "제목 없음";
                    body = "내용 없음";
                }
                System.out.printf("%s번 글이 생성되었습니다.\n", x++ );
                System.out.printf("제목 : %s\n ", title);
                System.out.printf("내용 : %s\n",body);

            }
            else {
                System.out.printf("%s(은)는 존재하지 않는 명령어 입니다.\n" , command);
            }
        }

        sc.close();
        System.out.println(" == 프로그램 종료 == ");
    }
}
