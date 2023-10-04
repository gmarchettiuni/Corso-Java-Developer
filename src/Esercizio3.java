/*
Data una stringa, stampare la stessa stringa invertendone il contenuto a partire dal primo spazio,
ad esempio data la stringa «come stai» stampare a video «stai come». Potete dare per assunto
che la stringa conterrà sempre un solo spazio.
 */
import java.util.Scanner;
public class Esercizio3 {

    // InvertiParole

    /*
    Data una stringa, stampare la stessa stringa invertendone il contenuto a partire dal primo spazio,
    ad esempio data la stringa «come stai» stampare a video «stai come». Potete dare per assunto
    che la stringa conterrà sempre un solo spazio.
    Suggerimento: utilizzate i metodi della classe String
     */

    public static void invertiStringa(String s) {
        String[] s_splitted = s.split(" ");
        // ["come", "stai"]
        System.out.println(s_splitted[1] + " " + s_splitted[0]);
        //String invertita = s_splitted[1] + " " + s_splitted[0];
        //System.out.println("La stringa invertita è: " + invertita);
    }

    public static void invertiStringa2(String s) {
        int index_spazio = s.indexOf(" "); // ritorna l'indice dove si trova
        String primaParola = s.substring(0,index_spazio);
        String secondaParola = s.substring(index_spazio + 1);
        String invertita = secondaParola + primaParola;
        System.out.println("La parola invertita è: " + invertita);
    }
}
