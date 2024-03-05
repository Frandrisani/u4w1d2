package es3;


import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa: ");
        String s = scanner.nextLine();
        while (!s.equalsIgnoreCase(":p")) {
            separa(s);
            System.out.println("Inserisci una stringa: ");
            s = scanner.nextLine();
        }
        scanner.close();
    }

    public static void separa(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i < s.length() - 1) {
                System.out.print(",");
            }

        }
    }
}

