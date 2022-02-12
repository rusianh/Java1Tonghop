import java.time.LocalDate;

/**
 * @note [LambdaStream]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Aug 1, 2021 (7:55:46 PM)
 * @version 1.0
 */
public class Person {
	private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private String country;
    
    public Person(){
        this.firstName = null;
        this.lastName = null;
        this.gender = null;
        this.birthYear = 0;
        this.country = null;
    }
    
    public Person(String firstName, String lastName, String gender, int birthYear, String country){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.country = country;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public int getBirthYear(){
        return this.birthYear;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public int getAge(){
        return LocalDate.now().getYear() - this.birthYear;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    
    public void setCountry(String country){
        this.country = country;
    }
    
    public void display (){
            System.out.println(firstName+" - "+lastName+ " - "+gender+" - "+birthYear+" - "+country+ " - "+getAge());
    }
}
