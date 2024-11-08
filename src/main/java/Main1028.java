class Main1028 {
    public static void main(String[] args) {
        //배열
/*
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int[] arr2 = arr;
        arr2[2] = 40;

        System.out.println(arr[2]);
*/
        // ctrl + / = 주석
        // ctrl + d = 한 줄 지우기
        // ctrl + Alt + 방향키 = 줄 복사
        // ctrl + Shift + f = 줄 정렬(습관적으로 하면 좋음)
        // Alt + 방향키 = 코드 왔다갔다
        // Tab = 들여쓰기
        // Tab + Shift = 내어쓰기

        // arr1 [ture, ture, false]
        // arr2 [3.14, 1.55, 6.7]
        // arr3 [1~10]

       /* boolean[] arr1 = new boolean[3];
        arr1[0] = true;
        arr1[1] = true;
        arr1[2] = false;
        System.out.println(arr1.length);
        double[] arr2 = new double[3];
        arr2[0] = 3.14;
        arr2[1] = 1.55;
        arr2[2] = 6.7;
        System.out.println(arr2[0]);*/
/*
        int[] arr3 = new int[10];
        for (int i =0; i< arr3.length; i++) {
            arr3[i] = i + 1;;
        }
        System.out.println(arr3.length);
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("arr3[%d] : %d\n", i, arr3[i]);
*/
        // 정수 10개 저장할 수 있는 배열 생성해서 변수와 연결
        int[] arr = new int[100];
        // 순서대로 값을 넣는 과정
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1) * 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : %d\n", i,arr[i]);
        }
        // 총합
        int sum = 0;
        // arr에 있는 값을 sum에 하나씩 더하는 과정
        for ( int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        //혼합 출력
        System.out.println("sum : " + sum);
        //평균 출력
        System.out.println("sum : " + sum / arr.length);
    }
    }
/*
}*/
