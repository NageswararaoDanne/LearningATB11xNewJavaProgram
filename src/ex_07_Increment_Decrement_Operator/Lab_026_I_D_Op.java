package ex_07_Increment_Decrement_Operator;

public class Lab_026_I_D_Op {

    public static void main(String[] args) {

        //Pre Increment -->  ++ Operator

        int a = 20;
        int b = ++a;

        int c = a++;

        System.out.println(b); //21
        System.out.println(a); // 22
        System.out.println(c); // 21

        System.out.println('\n');
        int a1 = 10;
        System.out.println(++a1 + a1++ + a1++);
        // 1+10= 11 + 11+1=12 + 12+1=13
        //11 + 11 + 12
        System.out.println(a1);
    }

}
