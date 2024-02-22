package metier;

public class Manager extends Employe{
    private String service;
public Manager(){

}
    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }
    @Override
    public String toString() {
        return super.toString()+"  service='" + service  ;
    }
    @Override
    public double calculerSalaire() {
    //calculer Salaire avec une augmentation de 20%
        return salaire+salaire*0.2;
    }
}
