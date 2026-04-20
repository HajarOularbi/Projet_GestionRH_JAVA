import java.time.LocalDate;
public class EmployeFixe extends Employe {
    private double salaireBase;
    private double primePerformance;

    public EmployeFixe(int id,String nom,String email,String departement,LocalDate dateEmbauche,double salaireBase,double primePerformance)
            throws InvalidWorkDataException {
        super(id,nom,email,departement,dateEmbauche);
        if (salaireBase<3000)
            throw new InvalidWorkDataException("Problème de salaire");
        this.salaireBase=salaireBase;
        this.primePerformance=primePerformance;
    }
    public double calculerPrimeAnciennete(){
        int anciennete=getAnciennete();
        double brut=calculerSalaireBrut();
        if(anciennete<2) return 0;
        else if(anciennete<=5) return brut*0.05;
        else return brut*0.10;
    }
    public double calculerSalaireBrut(){
        return salaireBase+primePerformance;
    }
}