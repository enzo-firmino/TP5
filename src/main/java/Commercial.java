public class Commercial extends Employes {


    private double chiffreAffaire;
    private double commission;


    private Commercial(int numSecu, String nom, String prenom, int echelon, double base, double nbHeure, double chiffreAffaire, double commission) {
        super(numSecu, nom, prenom, echelon, base, nbHeure);
        this.chiffreAffaire = chiffreAffaire;
        this.commission = commission;
    }

    public void negocier(){
        System.out.println("Je négocie");
    }

    public double salaireBrut(){
        return this.salaireBrut() * commission;
    }
}








