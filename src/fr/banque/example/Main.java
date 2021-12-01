package fr.banque.example;

public class Main {
    public static void main(String[] args) {
        Compte monCompte = new Compte();
        System.out.println(monCompte.toString());
        monCompte.depot(1000.00F);
        System.out.println(monCompte.toString());
        System.out.println(monCompte.testscanner());
        monCompte.virer(500.00F);
        System.out.println(monCompte.toString());
    }
}
