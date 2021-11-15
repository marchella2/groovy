package com.learngroovy

class ExceptionHandling {
    static void main(String[] args) {
        // Try catch
        try {
            int i = 1 / 1;
        } catch(ArithmeticException excp1){
            println("Catch block untuk catch ArithmeticException");
        }catch(Exception excp) {
            println("Bagian exception block");
            println(excp.getCause());
            println(excp.getMessage());
//            excp.printStackTrace();
        } finally {
            println("Ini bagian finally block");
        }
    }
}
