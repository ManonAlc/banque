package fr.banque.example;

import java.util.Scanner;

public class Compte {
    private int numeroCompte = 1;
    private float solde = 1000;

    public void depot(float valeur){
           solde += valeur;
       }

       public void afficherSolde(){ //void pour faire l'action, mais ne renvoi rien
           System.out.println(solde);
       }

       public void retrait(float valeur){
           solde -= valeur;
       };


        public float getSolde() {
        return solde;
        }

        public void virer(float valeur, Compte compteVirement){//on passe l'objet en paramètre
            retrait(valeur);
            compteVirement.solde = compteVirement.getSolde() + valeur;
        }
}
