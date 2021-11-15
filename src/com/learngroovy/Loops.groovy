package com.learngroovy

class Loops {
    static void main(String[] args) {
        // For
//        for (def i = 1;  i <= 5; i++) {
//            println(i);
//        }
        // Mendeklarasikan i terlebih dahulu
        int i = 1;
        for (i; i <= 5; i++) {
            println(i);
        }

        // For in
        for (a in 1..5){
            println(a);
        }

        // Upto
        1.upto(5){
            println "Angka = $it"
        }

        // Times
        5.times {
            println(it);
        }

        // Step
        1.step(10, 2){
            println "$it"
        }

        // Iterate over a list
        for (num in [0, 1, 2, 3, 4]){
            println(num);
        }

        // Iterate over a map
        def map = ["name": "Groovy", "subject": "Automation"];
        for(e in map){
            print(e.key + " : ");
            println(e.value);
        }

        // While loop
        int angka = 1;
        while(angka < 5){
            println(angka);
            angka++;
        }
    }
}
