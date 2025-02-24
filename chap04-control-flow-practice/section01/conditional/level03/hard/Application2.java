package com.LEGEND.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String fruit = sc.nextLine();
        String[] frs ={"사과", "바나나", "복숭아", "키위"};
        int[] pr ={1000, 3000, 2000, 5000};
        boolean found = false;

        for(int i = 0; i < pr.length; i++){
            if(fruit.equals(frs[i])){
                System.out.println(frs[i] + "의 가격은 " + pr[i] + "원 입니다.");
                return;
            }
        }
        System.out.println("준비된 상품이 없습니다.");
    }
}
