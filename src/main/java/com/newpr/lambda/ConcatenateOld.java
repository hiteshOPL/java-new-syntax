package com.newpr.lambda;

public class ConcatenateOld implements ConcatenateInterface{
    @Override
    public String sconcat(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {
        ConcatenateOld concatenateOld = new ConcatenateOld();
        System.out.println(concatenateOld.sconcat("ajkdhjshd", "ieureiur"));
    }
}
