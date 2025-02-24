package com.LEGEND.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호를 입력하세요 : ");
        char op = sc.next().charAt(0);
        int result = 0;

        switch(op){
            case '+' -> result = first + second;
            case '-' -> result = first - second;
            case '*' , 'x' ->  result = first * second;
            case '/' -> result = first / second;
            case '%' -> result = first % second;
            default ->  {
                System.out.println("입력하신 연산은 없습니다.");
                System.out.println("프로그램 종료");
            }
        };

        System.out.println(first + " " + op + " " + second + " = " + result );

    }
}



//                System.out.println("입력하신 연산은 없습니다.");
//                System.out.println("프로그램 종료");