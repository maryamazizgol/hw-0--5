public class Main {

    public static void main(String[] args) {
        int mark= 96;

        if (mark< 40) {
            System.out.println("F");
        } else if (mark <= 59) {
            System.out.println("C");

        } else if (mark<= 79) {
            System.out.println("B");
        }

        else if (mark<= 95) {
            System.out.println("A");
        }
        else {
            System.out.println("A+");
        }
    }
}
