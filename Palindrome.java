import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("Enter word here: ");
        String strScan = scan.nextLine().replaceAll("\\s",  "");

        String revScan = "";

        int intScan = strScan.length();

        for (int length = (intScan-1); length >= 0; --length){
            revScan += strScan.charAt(length);
        }

        if(strScan.equals(revScan)) {
            System.out.println(strScan + " is a palindrome.");
        }
        else{
            System.out.println(strScan + " is NOT a palindrome.");
        }
    }
}
