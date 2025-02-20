package com.LEGEND.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("체중을 입력하세요 : ");
        int weight = sc.nextInt();
        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble() / 100;
        double BMI = weight / (height * height);

        if(BMI < 20){
            System.out.println("당신은 저체중 입니다.");
        }
        else if(BMI < 25){
            System.out.println("당신은 정상체중 입니다.");
        }
        else if(BMI < 30){
            System.out.println("당신은 과체중 입니다.");
        }
        else{
            System.out.println("당신은 비만입니다.");
        }
    }
}
