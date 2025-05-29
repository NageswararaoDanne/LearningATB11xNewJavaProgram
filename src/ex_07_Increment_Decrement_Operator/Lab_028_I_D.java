package ex_07_Increment_Decrement_Operator;

public class Lab_028_I_D {

    public static void main(String[] args) {


        int a = 50;

        System.out.println(a++ + ++a); // 50+52 = 102
        System.out.println(a); // a = 52

        // A + B
        // A --> a++ --> Exp-A = 50 but a = 51
        // +
        // B --> ++a --> Exp-B = 52 but a = 52


    }
}
