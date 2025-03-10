import java.util.Scanner;

public class Confidentiality {
    
    public static void encrypt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t\tInput String: ");
        String str = scanner.next();
        System.out.print("\n\t\tEncrypted String: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print((char) (str.charAt(i) + 3));
        }
        System.out.println();
    }
    
    public static void decrypt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t\tInput String: ");
        String str = scanner.next();
        System.out.print("\n\t\tDecrypted String: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print((char) (str.charAt(i) - 3));
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        char ch;
        
        System.out.println("\t\tConfidentiality");
        
        do {
            System.out.println("\t\tChoose operation");
            System.out.println("\t\t1. Encryption");
            System.out.println("\t\t2. Decryption");
            System.out.println("\t\t3. Exit");
            System.out.print("\t\t\n\t\t");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    encrypt();
                    break;
                case 2:
                    decrypt();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            
            System.out.print("\n\t\tDo you want to continue (Y/N): ");
            ch = scanner.next().charAt(0);
            
        } while (ch == 'y' || ch == 'Y');
        
        scanner.close();
    }
}