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
public class Couple {
    
    private Person male;
    private Person female;
    
    public Couple(Person male, Person female)
    {
    this.male = male;
    this.female = female;
    }
    
    public Person getMale()
    {
        return male;
    }
    
    public Person getfemale()
    {
        return female;
    }
}
