package es1;
import java.util.Scanner;


public class esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String s = scanner.nextLine();
        boolean risultato = stringaPariDispari(s);
        System.out.println(risultato);
        System.out.println("Inserisci un anno");
        int anno = Integer.parseInt(scanner.nextLine());
        boolean risultato2 = annoBisestile(anno);
        System.out.println(risultato2);

    }


    public static boolean stringaPariDispari(String s) {
        if(s.length()%2==0){
            return true;
        }else{
            return false;
        }

    }

    public static boolean annoBisestile(int anno) {
        if(anno%4==0 || anno%100==0 && anno%400==0) {
            return true;
    }else{
        return false;
    }

    }
    }




