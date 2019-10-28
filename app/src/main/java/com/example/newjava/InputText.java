package com.example.newjava;

import java.util.Scanner;

public class InputText {
    public static void main(String [] args){
        Scanner in;
        in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.println("1번쨰정수를 입력하시오");
        num1= input.nextInt();
        System.out.println("2번쨰정수를 입력하시오");
        num2= input.nextInt();


        int res =num1 + num2;
        System.out.println("res = "+res);

        float num3;
        System.out.println("3번쨰 실수를입력해주세요");
        num3= input.nextFloat();
        System.out.println("num3 = "+num3);

        System.out.println("num3 = "+num3+", b="+ num2);


    }
}
