package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        if (x < 0) {
            System.out.println("Error");

        }else{
                double S = 0;
                for (int i = 0; i < x; i++) {


                    double F = Math.pow(x - 1, 2 * n + 1) / (2 * n + 1) * Math.pow(x + 1, 2 * n + 1);
                    S=S+F;
                    System.out.println(S);
                }
            }
        }
    }
