package ex_05_TypeCasting;

public class Lab_023_Widening_Implicit {

    public static void main(String[] args) {

        int a = 10;

        byte b = (byte)a; // Explicit Casting - narrowing

        byte a1 = 20;

        int b1 = a1; // Implicit Casting - Widening

        int c = 200;
        long d = c; // Implicit

        short s = 30000;
        int i = s; // Implicit




    }
}
