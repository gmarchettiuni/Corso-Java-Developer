import java.util.Scanner;

public class Esercizio1 {

    // OperazioniAritmetiche

    /*
    Scrivere un programma Java che permetta all’utente di inserire due numeri interi e,
    successivamente, stampi a video il risultato di addizione, sottrazione, moltiplicazione e divisione
    tra i due numeri.
    */
    public static void calcolaOperazione(){
        // definisco lo scanner e prendo i due numeri dall'utente
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci due numeri interi");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        // stampa le varie operazioni
        int somma = num1 + num2;
        System.out.println("La somma è: " + somma);
        int sottrazione = num1 - num2;
        System.out.println("La differenza è: " + sottrazione);
        int moltiplicazione = num1 * num2;
        System.out.println("Il prodotto è: " + moltiplicazione);
        if (num2 == 0){
            System.out.println("Non si può dividere per 0");
            return; // altrimenti al posto di return mettere fuori l'else
        }
            // int divisione = num1 / num2;
            double divisione = (double) num1 / (double) num2;
            System.out.println("La divisione è: " + divisione);
    }
}
