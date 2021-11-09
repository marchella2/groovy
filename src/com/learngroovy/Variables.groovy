package com.learngroovy

class Variables {
    static void main(String[] args) {
        def name = "Marchella";
        // Perubahan variable
        name = "Acel";
        String alamat = "Cigombong";
        println("Hello, my name is " + name);
        println("Saya tinggal di ${alamat}");

        // Mendeklarasikan variable secara bersamaan
        def (String a, int b, Double c) = [30, 25, 5];
        println (a);
        // Print bisa dilakukan juga tanpa tanda ()
        println b;
        println c;
    }
}
