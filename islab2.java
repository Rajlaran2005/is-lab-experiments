import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:\n");
        String input = scanner.nextLine();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes());
            
            System.out.print("The byte equivalent of hash is: ");
            for (byte b : hashBytes) {
                System.out.printf("%02x", b);
            }
            System.out.println();
            
            System.out.println("The available algorithms are: MD5, SHA-1, SHA-256");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: Algorithm not found");
        }

        scanner.close();
    }
}