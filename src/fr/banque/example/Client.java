package fr.banque.example;

public class Client {
    private String name = "toto";
    private Compte compteUtilisateur = new Compte();

    public String getName() {
        return name;
    }
    public float getSolde() {
        return compteUtilisateur.getSolde();
    }
    public void afficherSolde() {
        System.out.println(compteUtilisateur.getSolde());
        //compteUtilisateur.afficherSolde();
    }
}

