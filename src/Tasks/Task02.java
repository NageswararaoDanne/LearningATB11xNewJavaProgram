package Tasks;

public class Task02 {

    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--); // 19+19+20 = 58
        // 19, a = 19
        // 19, a= 20
        // 20 , a = 19

        System.out.println(a); // 19
    }
}
