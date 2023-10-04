import java.util.Scanner;

public class Main {
    // il main non va messo dentro una classe
    // per questione di ordine meglio farlo a parte

    public static void main(String[] args) {
        // test esercizio 0
        System.out.println("ESERCIZIO 0");
        System.out.println(Esercizio0.lunghezzaStringa());
        System.out.println(Esercizio0.reverseString("Ciao Greta"));
        System.out.println("----------");
        // test esercizio 1
        System.out.println("ESERCIZIO 1");
        Esercizio1.calcolaOperazione();
        System.out.println("----------");
        // test esercizio 2
        System.out.println("ESERCIZIO 2");
        Esercizio2.printEven(8);
        System.out.println("----------");
        // test esercizio 3
        System.out.println("ESERCIZIO 3");
        Esercizio3.invertiStringa("Java developer");
        Esercizio3.invertiStringa2("buongiorno mondo");
        System.out.println("----------");
        // test esercizio 4
        System.out.println("ESERCIZIO 4");
        Esercizio4.intrusi("Marco", "Java", "ciao MarcopippoMarco Pippo");
        System.out.println("-----------");
        // test esercizio 5
        System.out.println("ESERCIZIO 5");
        Esercizio5.stampaStringheUguali("Marco", "marco", "marco");
    }
}