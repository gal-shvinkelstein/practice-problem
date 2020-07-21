package pragmaticdeveloper.info.java.io;

import java.util.Scanner;

public class ScannerMethodUsage {
    public static void main(String[] args) {
        //Cusor, token
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        // nextInt and next read first token and leave the rest of string
        // nextLine read the complete line from begaining until new line char(\n)
        int age = sc.nextInt();
        System.out.println("Enter first name");
        String fName = sc.next();
        String lName = sc.next();
        System.out.println(age);
        System.out.println(fName);
        System.out.println(lName);
    }
}
