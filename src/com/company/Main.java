package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(inputStrings(4));
    }

    private static StringBuilder inputStrings(int n){
        if(n <= 0 || n >= 10){
            return null;
        }
        StringBuilder resultStr = new StringBuilder();
        String currentStr;
        int startI;
        int endI;
        for(int i = 0; i < n; i++){
            startI = 0;
            endI = 0;
            currentStr = scanIn().concat("\n");
            for (int j = 0; j <= i; j++){
                startI = endI;
                endI = !resultStr.toString().equals("") ? resultStr.indexOf("\n", startI + 1) : 0;
                int prevStrLeng = endI - startI;
                if (currentStr.length() <= prevStrLeng || j == i){
                    resultStr.insert(startI <= 0 ? 0 : startI + 1, currentStr);
                    break;
                }
            }
        }
        return resultStr;
    }

    private static String scanIn(){
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("text:");
        str = scan.nextLine();
        return str;
    }
}
