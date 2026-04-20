import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        try {
            Employe e1 = new EmployeFixe(
                    1, "Hajar", "hajarou@gmail.com", "IT", LocalDate.of(2025, 9, 1),10000, 2000);
            System.out.println("Salaire Net Fixe: " +e1.calculerNetAPayer());
        } catch (InvalidWorkDataException e) {
            System.out.println("Erreur métier: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erreur générale: " + e.getMessage());
        }
    }
}