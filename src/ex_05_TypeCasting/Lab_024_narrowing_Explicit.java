package ex_05_TypeCasting;

public class Lab_024_narrowing_Explicit {

    public static void main(String[] args) {


        long l = 9640640333l;
        // int i = l; not posible directly implicit we need to use explicit

        byte b = (byte)l; // Explicit - Narrowing
    }
}
