package org.example;


public class Main {
    public static void main(String[] args) {

        int sum = sumMethod(3,5);
        System.out.println(returnString(6,2));
        System.out.println(faculty(5));
        System.out.println(facultyWhile(5));
    }

    //This method don´t run correctly. It have to repair
    public static long facultyWhile(int num){
        long result = 1;
        long counter = 1;

        while(counter < num){
            result *= counter;
            counter++;
        }

        return result;
    }
    public static int faculty(int num){
        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;

    }

    public static int facultyDecrement(int n){

        for(int i = n; i>1; i--){
            n *= (i-1);
        }
        return n;
    }
    public static int sumMethod(int num1, int num2){
        return num1 +  num2;
    }

    public static String returnString(int num1, int num2){
        return "Summe: " + (num1 + num2);

    }
}