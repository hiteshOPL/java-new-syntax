package com.newpr.progs;

public class PDRM {
    public static void main(String[] args) {
        int num = 3553;
        int rvsNum = 0;
        int remainder;
        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            rvsNum = rvsNum * 10 + remainder;
            num = num / 10;
        }
        System.out.println(rvsNum);
    }
}
