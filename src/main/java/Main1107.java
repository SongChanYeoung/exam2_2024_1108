//import java.util.stream.IntStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main1107 {
    public static void main(String[] args) {
/*        // 일반
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 스트림
        IntStream.rangeClosed(1, 10)
                .forEach(e -> {
                    System.out.println(e);
                });

        // 스트림
        IntStream.rangeClosed(1, 10)
                .forEach(e -> System.out.println(e));

        // 스트림
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);*/
/*        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        IntStream.rangeClosed(1, 10)
                .forEach(e -> {
                    System.out.println(e);
                });
        IntStream.rangeClosed(1, 10)
                .forEach(e -> System.out.println(e));
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);*/
        /*System.out.println("일반 버젼");
        int[] arr = {20, 30 ,40, 22, 4 , 77, 8, 31, 90, 10 };

        int resultArrLen = 0;

        for (int n : arr) if (n % 2 == 0) resultArrLen++;

        int[] resultArr = new int[resultArrLen];

        int resultArrLastIndex = -1;

        for (int n : arr) {
            if ( n % 2!= 0) continue;

            resultArr[++resultArrLastIndex] = n;
        }
        // map

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i]*=2;
        }*/
        int[] arr = new int[10];

        try {
            채우다(arr);
        }
        catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println("작업이!! 정상종료 되지 않았습니다.");
        }
        for ( int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i +"] =>" + arr[i]);
        }
    }
    static void 채우다(int[] arr) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i< 11; i++) {
            arr[i] = (i + 1) * 100;
        }
    }
}