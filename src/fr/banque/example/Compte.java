package fr.banque.example;

import java.util.Scanner;

public class Compte {
    private int numeroCompte = 1;
    private float solde = 1000;
       /* public void depot(float valeur);
        public void retrait(float valeur); //void ne renvoit rien
        private float getSolde();
        private void afficherSolde();
    void virer(float valeur, Compte destinataire);*/

       public void depot(float valeur){
           solde += valeur;
       }
       public String toString(){ //string type renvoyer
           return String.valueOf(solde);
           System.out.println("le solde du client " + .numeroCompte + "est de : " + .solde + " euros");
       }
       public float testscanner(){ //float return float
           Scanner scanner = new Scanner(System.in);
           float a = scanner.nextFloat();
           return a;
       }
       public void retrait(float valeur){
           solde -= valeur;
       }

        public float getSolde() {
        return solde;
        }

        public void virer(float valeur){

        }
}
