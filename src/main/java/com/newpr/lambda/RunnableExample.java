package com.newpr.lambda;

public class RunnableExample {
    public static void main(String[] args) {

        // OLD WAY
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Old : " + sum);
            }
        };
        new Thread(runnable).start();

        // NEW WAY
        Runnable runnable1 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("New : " + sum);
        };
        new Thread(runnable1).start();

        // Thread with lambda
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("NewLambda : " + sum);
        }).start();
    }
}
