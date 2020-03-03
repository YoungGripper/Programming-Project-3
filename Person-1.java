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

public class Person {
    
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    
    public Person(String firstName, String lastName, LocalDate dateOfBirth)
    {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    }
    
    public String getFName()
    {
    return firstName;
    }
    
    public String getLName()
    {
    return lastName;
    }
    
    public LocalDate getDOB()
    {
    return dateOfBirth;
    }
}
