import java.util.Scanner;

public class ReverseStringAssignment {
    public static void main(String[] args){

        Scanner keybd = new Scanner(System.in);
        String word;


        System.out.println("which string d you want to reverse ?");

        word= keybd.nextLine();
        String newWod = new StringBuilder(word).reverse().toString();

        System.out.println(newWod);
    }
}
