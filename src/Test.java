import java.util.Scanner;

public class Test {
    private static int x;

    public static void print() {
        int array[] = new int[26];

        char firstLetter = 'A';

        for (int i = 0; i < array.length; i++) {

            array[i] = firstLetter;
            firstLetter++;

        }
        System.out.println();
        int code[] = new int[26];
        int firstCode = 0;
        for (int i = 0; i < code.length; i++) {
            code[i] = firstCode;
            firstCode++;
        }

    }

    public static void translating() {
        Scanner sc = new Scanner(System.in);
        char firstLetter = 'A';
        System.out.println("Zadejte prosím váš kód");
        System.out.println("---------------------------");
        System.out.println("Váš vstup je ");

        String s = sc.nextLine();
        String cut[] = s.split("-");

        System.out.print("Váš výstup je ");
        for (int i = 0; i < cut.length; i++) {

            int x = Integer.parseInt(cut[i]);

            System.out.print((char) (firstLetter + x) + "");

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String end = "";
        do {
            print();
            translating();
            System.out.println();


        } while (!end.equals("end"));


    }
}
