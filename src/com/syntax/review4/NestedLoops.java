package com.syntax.review4;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <=3 ; i++) {
            //outer loop controls number of complete iterations

            System.out.println(i);

            for (int j = 0; j <= 1; j++) {
                //inner loop ALWAYS depends on outer loop
                System.out.println(j);

            }

        }

    }
}
