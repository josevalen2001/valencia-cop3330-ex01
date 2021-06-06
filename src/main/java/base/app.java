package base;
import java.util.*;

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("What is your name? ");
        String name = newScan.nextLine();

        //Concat
        String output="Hello, "+name+", nice to meet you!";

        //Output
        System.out.println(output);
    }

}
