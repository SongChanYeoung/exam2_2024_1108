public class Main1101 {
    public static void main(String[] args) {
/*        무기 a무기 = new 칼();
        a무기.공격();

        a무기 = new 활();
        a무기.공격();
    }
}
class 무기 {
    void 공격() {
     }
}

class 칼 extends 무기 {
    void 공격() {
        System.out.println("칼로 공격합니다!!!");
    }
}

class 활 extends 무기 {
    void 공격() {
        System.out.println("활로 공격합니다!!!");*/
        /*전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립이", "창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    String 공격자명;
    String 무기명;

    void 공격(String 공격자명, String 무기명) {
        this.공격자명 = 공격자명;
        this.무기명 = 무기명;

        재공격();
    }

    void 재공격() {
        System.out.printf("%s(가) %s(으)로 공격합니다.\n", 공격자명, 무기명);*/
        /*int i = 10;
        double d = i; // 여기선 자동형변환 허용
        i = (int) d; // 여기선 자동형변환 불가능

        System.out.println(i);*/
       /* 사람 a사람 = new 사람();
        a사람.a왼팔 = new 팔();
        팔 a팔 = new 팔();
        a사람.a왼팔.길이 = 20;
        System.out.println(a사람.a왼팔.길이);
    }
}

class 사람 {
    int 나이;
    // 클래스안에 변수를 정의 할 수 있다.
    팔 a왼팔;

}
class 팔{
    int 길이;
}*/
        /*전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격("카니", "활");
        // 출력 : 카니가 활로 공격합니다.
        a전사.a무기 = new 칼();
        a전사.공격("카니", "칼");
        // 출력 : 카니가 칼로 공격합니다.
    }
}
class 전사 {
    String 이름;
    int 나이;
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    class 무기 {
        String 공격자명;
        String 무기명;

        void 공격(String 공격자명, String 무기명) {
            System.out.printf("%s(가) %s(으)로 공격합니다.\n", 공격자명, 무기명);
            this.공격자명 = 공격자명;
            this.무기명 = 무기명;

        }

        class 활 extends 무기 {
        }

        class 칼 extends 무기 {
        }
    }
}*/
/*
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        a무기.작동();
    }
}

class 무기 {
    void 작동(String 이름){

    }

}

class 칼 extends 무기 {
    void 작동(String 사용자명){

    }

}

class 활 extends 무기 {
    void 작동(String 사용자명){

    }

}
*/
    }
}