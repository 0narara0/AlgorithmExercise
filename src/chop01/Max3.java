package chop01;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 : "); int a = stdIn.nextInt();
        System.out.println("b의 값 : "); int b = stdIn.nextInt();
        System.out.println("c의 값 : "); int c = stdIn.nextInt();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
/*
   메서드           자료형        입력값의 범휘
* nextBoolean()    boolean      true 또는 false
  nextByte()        byte          -128 ~ +127
  nextShort()      short        -32768 ~ +32767
  nextInt()        int          -2147483648 ~ +2147483647
  nextlong()       long
  nextFloat()
  nextDouble()
  next()          String          문자열(스페이스, 줄 바꿈 문자로 구분)
  nextLine()      String          문자열 1줄
* */
