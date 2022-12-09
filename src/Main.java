import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String s1;
        String s2;
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter your First Statement ");
        s1=scanner.next();
        System.out.println(" Enter your Scaned Statement ");
        s2=scanner.next();
        System.out.println(" Results " + s1.contains(s2));


    }
}