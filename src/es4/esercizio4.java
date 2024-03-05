package es4;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");
        int n = scanner.nextInt();
        conto(n);
        scanner.close();

}

public static void conto(int n) {
    for (int i = n; i >-1 ; i--) {
        System.out.println(i);
    }
}
}
