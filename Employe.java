import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public abstract class Employe implements IPaye {
    protected int id;
    protected String nom;
    protected String email;
    protected String departement;
    protected LocalDate dateEmbauche;

    public Employe(int id, String nom, String email, String departement, LocalDate dateEmbauche) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.departement = departement;
        this.dateEmbauche = dateEmbauche;
    }
    public int getAnciennete(){
        return (int)ChronoUnit.YEARS.between(dateEmbauche,LocalDate.now());
    }

}
