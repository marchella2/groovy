package com.learngroovy

class ConditionalStatement {
    static void main(String[] args) {
        def num = 15;

        // If statement
        if (num == 10){
            println("Value = 10");
        } else { // If else statement
            println("The value is not 10 ");
        }

        def angka = -11;

        // If elseif statement
        if (angka > 0){
            println("Angka positif");
        } else if (angka == 0){
            println("Angka 0");
        } else {
            println("Angka negatif")
        }

        // Switch Case
        def x = 10;
        def result = "";

        switch(x) {
            case 0:
                result = "x is 0";
                break;
            case {x > 0}:
                result = "x is positive number";
                break;
            case {x < 0}:
                result = "x is negative number";
                break;
            default:
                result = "Invalid number";
        }
        println(result);
    }
}