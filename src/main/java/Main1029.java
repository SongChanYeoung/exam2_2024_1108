public class Main1029 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        // 철수, 영희, 영수, 나이 묶기
        Person a = new Person();
        a.age = 20;
        a.name = "철수";
        a.isMarried = false;
        a.intriduce();
        a.run();
    }
}
    class Person {
      int age;
      String name;
      boolean isMarried;

      void intriduce() {
          System.out.println("== 자기소개 ==");
          System.out.printf("이름 : %s\n", this.name);
          System.out.printf("나이 : %d\n", this.age);
          System.out.printf("결혼여부 : %b\n", this.isMarried);
      }

      void run() {
          System.out.println("철수가 달립니다.");

      }

}
