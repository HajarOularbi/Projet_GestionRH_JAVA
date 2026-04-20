public interface IPaye {
    double calculerSalaireBrut();
    double calculerPrimeAnciennete();
    default double calculerCharges(double taux){
        return(calculerSalaireBrut()+calculerPrimeAnciennete())*taux;
    }
    default double calculerNetAPayer(){
        double Brut = calculerSalaireBrut();
        double Prime = calculerPrimeAnciennete();
        double Charges = calculerCharges(0.20);
        return (Brut + Prime) - Charges;
    }
}
