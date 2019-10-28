package com.example.newjava;

import java.util.Random;

public class Quiz {

    public static void main(String [] args) {

        int i;
        int randData[];
        int lostMem = 0;
        final int ELEMNUM = 100;
        final int MAXMEM= 4096;
        randData = new int[ELEMNUM];
        int storage[] = {4096, 8192, 16384, 32768, 65526, 2^17};

        Random rand = new Random();
        for(;;){
            for(i=0;i<ELEMNUM;i++){
            randData[i] = rand.nextInt(4096)+1;
            System.out.println("randData["+i+"]"+randData[i]);
            lostMem +=  MAXMEM -randData[i];
        }

        System.out.println("lostMem = "+lostMem);
        lostMem =0;
        }



    }
    }
