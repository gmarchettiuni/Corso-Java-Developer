import java.util.Scanner;

public class Esercizio2 {

    // PrintEven

    // Dato un numero, stampare true se il numero è pari, false altrimenti.

    public static void printEven(int n){
        //boolean pari = (n % 2 == 0);
        //System.out.println("Il numero è pari? " + pari);
        if (n % 2 == 0) System.out.println("Il numero è pari");
        else System.out.println("Il numero è dispari");
        // se solo una riga di codice posso evitare di mettere graffe;
        //else System.out.println("numero dispari");
    }
}
