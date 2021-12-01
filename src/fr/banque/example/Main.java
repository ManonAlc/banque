package fr.banque.example;

public class Main {
    public static void main(String[] args) {
        //Compte monCompte = new Compte();
        //Compte deuxiemeCompte = new Compte();
        //monCompte.depot(1000.00F);
        //monCompte.afficherSolde();
        //monCompte.virer(500.00F, deuxiemeCompte);
        //monCompte.afficherSolde();
        //monCompte.retrait(200.00F);
        //monCompte.afficherSolde();
        //deuxiemeCompte.afficherSolde();
        Client newClient = new Client();
        System.out.println(newClient.getName());
        System.out.println(newClient.getSolde());
        newClient.afficherSolde();

    }
}
