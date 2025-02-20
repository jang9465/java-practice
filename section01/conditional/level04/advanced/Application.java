package com.LEGEND.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int mat = sc.nextInt();

        int avg = (kor + eng + mat) / 3;

        if(avg >= 60){
            if(kor >= 40){
                if(eng >= 40){
                    if(mat >= 40){
                        System.out.println("합격입니다!");
                    }
                    else{
                        System.out.println("수학 과목의 점수 미달로 불합격 입니다.");
                    }
                }
                else{
                    System.out.println("영어 과목의 점수 미달로 불합격 입니다.");
                }
            }
            else{
                System.out.println("국어 과목의 점수 미달로 불합격 입니다.");
            }
        }
        else{
            System.out.println("평균 점수 미달로 불합격 입니다.");
        }
    }
}
