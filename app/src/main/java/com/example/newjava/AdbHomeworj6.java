package com.example.newjava;

import java.util.Random;

public class AdbHomeworj6 {

    public static void main(String [] args) {

        int storage[] = {4096, 8192, 16384, 32768, 65526, 2 ^ 17};
        final int MAXLEN = 10;

        //실제데이터가 배치되는영역
        int arr[] = new int[MAXLEN];
        //인텍스로 활용할예정
        int idx[] = new int[MAXLEN];
        Random rand= new Random();


         /*4096 = 2^12,^13,2^14.2^&15,2^16,2^17
            * 2^12 = 00 0001 0000 0000 0000  -> 0
            * 2^13 = 00 0010 0000 0000 0000  -> 1
            * 2^14 = 00 0100 0000 0000 0000  -> 2
            * 2^15 = 00 1000 0000 0000 0000  -> 3
            * 2^16 = 01 0000 0000 0000 0000  -> 4
            * 2^17 = 10 0000 0000 0000 0000  -> 5

            &~== and not, nand
             */

        for(int i = 0 ; i < MAXLEN; i++){
            /*rand.nextInt(131072)+1;
            * 1<=x< 131073
            * 어차피정수이므로
            * 1<= x <= 131072

            * &~ nand 는 특정 숫자배수로 정렬시키니는 특수한 기능이 있다.
            * 현재 케이스의 경우 4096의 배수로 정렬시킨 것이다.*/
            idx[i]=(rand.nextInt(131072)+1) &~ (4095);
            System.out.println("idx["+i+"] = " +idx[i]+ ", idx = "+idx[i]/4096);


        }

        //공간 무작위배치를 명시;
        for(int i=0; i< MAXLEN; i++){
            idx[i] = rand.nextInt(6);// 범위가 0-5까지. 설계해둔 인덱스와 일치.
        }
        for(int i=0; i< MAXLEN; i++) {
            arr[i]= rand.nextInt(131072)+1;

            /*32768의 데이터 공간에 17000데이터  배정. 00>나머지 13000.
            * 어떻게 나눠?
            * 정렬 시키는 &~ 사용하여 큰거부터 배치?
            *
            * 각각의 공간을 효율적으로 사용하기 위해 4096의 배수로 봄.
            * ? 물리메모리의 표준 사이즈
            * 17000원 -->4096이5ㄱ0ㅐ 소요된것.반정도 채웠. 빈공간 남았지만, 채우면 날아감.
            * 이 공간을 효율적으로 풀기. */
        }
        System.out.println("15000 nand 4095 = " + (15000 &~ 4095));
    }

}
