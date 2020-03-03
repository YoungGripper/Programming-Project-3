/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwedding;

/**
 *
 * @author Tony
 */
import java.time.LocalDate;
import java.time.Month;
public class TestWedding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       LocalDate maleDOB = LocalDate.of(2000,6,30);
       Person man = new Person("K ","Smith",maleDOB);
       LocalDate femaleDOB = LocalDate.of(2000,4,16);
       Person woman = new Person("T ","Hands",femaleDOB);
       
       Couple couple = new Couple(man, woman);
       LocalDate dateOfWedding = LocalDate.of(2020, 5, 16);
       
       Wedding wedding1 = new Wedding(dateOfWedding,couple, "New York");
       
       printWeddingDetails(wedding1);
       
       maleDOB = LocalDate.of(1999, 5, 01);
       man = new Person("C ", "James", maleDOB);
       femaleDOB = LocalDate.of(1999, 4, 21);
       woman = new Person("S ", "Brett", femaleDOB);
       
       couple = new Couple(man, woman);
       Wedding wedding2 = new Wedding(dateOfWedding,couple, "Minnesota");
       
       printWeddingDetails(wedding2);
       
       
    }
    
    private static void printWeddingDetails(Wedding wedding)
    {
    System.out.println("Wedding Couples");
    
    System.out.println("Groom Name: Mr " + wedding.getCouple().getMale().getFName() + "" + wedding.getCouple().getMale().getLName());
    System.out.println("Bride Name: Mrs " + wedding.getCouple().getfemale().getFName() + "" + wedding.getCouple().getfemale().getLName());
    
    System.out.println("DOB of Male: " + wedding.getCouple().getMale().getDOB());
    System.out.println("DOB of female: " + wedding.getCouple().getfemale().getDOB());
    
    System.out.println("Wedding Date: " + wedding.getWeddingDate());
    System.out.println("Location: " + wedding.getWeddingLocation());
    }
}
