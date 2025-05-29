package ex_03_Literals;

public class Lab015_Escape_Character_Literals {

    public static void main(String[] args) {

       // Escape Char

        char C = 'A';

        char new_line = '\n';
        char back_line = '\b';
        char new_tab = '\t';
        char carriage_return = '\r';

        System.out.println("NageswaraRao\bDanne");
        System.out.println("NageswaraRao"+new_tab+"Danne");
        System.out.println("NageswaraRao\nDanne");
        System.out.println("NageswaraRao\tDanne");
        System.out.println("NageswaraRao\rDanne");


    }
}
