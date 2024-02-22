package Presentation;

import metier.Employe;
import metier.Ingenieur;
import metier.Manager;

public class Application {
    public static void main(String[] args) {
        Employe em1=new Ingenieur("ing1","Ali","ali@gmail.com","066666666",4500,"tache1");
        Employe em2=new Manager("nom1","prenom,","email1","06622222",5600,"service2");
        System.out.println(em1);
        System.out.println("Salaire Ingenieur: "+em1.calculerSalaire());
        System.out.println("-------------------");
        System.out.println(em2);
       System.out.println("Salaire Manager: "+em2.calculerSalaire());
    }
}
