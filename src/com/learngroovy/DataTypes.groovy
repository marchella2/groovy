package com.learngroovy

class DataTypes {
    static void main(String[] args) {
        // tipe data byte
        println("1. Tipe data Byte")
        def b = (byte)10; // Mengubah tipe data dari integer ke byte
        println(b);
        println(b.getClass().getName()); // Untuk mengetahui tipe data dari variable tersebut
        // Untuk mengetahui minimal dan maksimal value dari tipe data byte
        println "Nilai minimal byte adalah : " + Byte.MIN_VALUE;
        println "Nilai maksimal byte adalah : " + Byte.MAX_VALUE;

        println("======================================");

        // Tipe data short
        println("2. Tipe data Short")
        short s = 100;
        println s;
        // Untuk mengetahui minimal dan maksimal value dari tipe data short
        println "Nilai minimal short adalah : " + Short.MIN_VALUE;
        println "Nilai maksimal short adalah : " + Short.MAX_VALUE;

        println("======================================");

        // Tipe data integer
        println("3. Tipe data Integer")
        int i = 1000;
        println(i);
        // Untuk mengetahui minimal dan maksimal value dari tipe data integer
        println("Nilai minimal integer adalah : " + Integer.MIN_VALUE);
        println("Nilai maksimal integer adalah : " + Integer.MAX_VALUE);

        println("======================================");

        // Tipe data long (bisa menggunakan L dibelakang angka)
        println("4. Tipe data Long")
        long l = 1000000L;
        println(l);
        // Untuk mengetahui minimal dan maksimal value dari tipe data long
        println "Nilai minimal long adalah : " + Long.MIN_VALUE;
        println "Nilai maksimal long adalah : " + Long.MAX_VALUE;

        println("======================================");

        // Tipe data float (decimal values)
        println("5. Tipe data Float");
        float f = 100.002F;
        println f;
        // Untuk mengetahui minimal dan maksimal value dari tipe data float
        println("Nilai minimal float adalah : " + Float.MIN_VALUE);
        println("Nilai maksimal float adalah : " + Float.MAX_VALUE);

        println("======================================");

        // Tipe data double (decimal values)
        println("6. Tipe data Double");
        double d = 1000.0002D;
        println d;
        println "Nilai minimal double adalah : " + Double.MIN_VALUE;
        println "Nilai maksimal double adalah : " + Double.MAX_VALUE;

        println("======================================");

        // Tipe data char (hanya menampung 1 character)
        println("7. Tipe data char")
        char c = 'A';
        println(c);

        println("======================================");

        // Tipe data boolean
        println("8. Tipe data boolean")
        boolean flag = true;
        println(flag);

        println("======================================");

        // Tipe data String
        println("9. Tipe data String");
        String str = "Groovy";
        println str;
    }
}
