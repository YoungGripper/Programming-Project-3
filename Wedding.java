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

public class Wedding {
    
    private LocalDate dateOfWedding;
    private Couple couple;
    private String location;
    
    public Wedding(LocalDate dateofWedding, Couple couple, String location)
    {
        this.dateOfWedding = dateOfWedding;
        this.couple = couple;
        this.location = location;
    }

    
    public LocalDate getWeddingDate()
    {
        return dateOfWedding;
    }
    
    public Couple getCouple()
    {
        return couple;
    }
    
    public String getWeddingLocation()
    {
        return location;
    }
}
