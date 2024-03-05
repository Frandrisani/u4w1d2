package es2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero da 0 a 3");
        int numero = scanner.nextInt();
        String risultato = numString(numero);
        System.out.println(risultato);
        scanner.close();

}

    public static String numString(int n) {
        switch (n) {
        case 0:
        return "zero";
        case 1:
        return "uno";
        case 2:
        return "due";
        case 3:
        return "tre";
        default:
        return "non hai inserito un numero da 0 a 3";
    }
    }
}
