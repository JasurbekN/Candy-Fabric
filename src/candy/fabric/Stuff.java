/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;


/**
 *
 * @author Acer-Aspire
 */
public final class Stuff {

    /**
     *
     * @param personObj
     * @param emailAddress
     * @param id
     * @param stuffTypeString
     * @param passwordOriginal
     * @param passwordCopy
     */
    public Stuff( Person personObj, String emailAddress,String id,String stuffTypeString,String passwordOriginal, String passwordCopy)
    {
        setStuffTypeString(stuffTypeString);
        setPersonObj(personObj);
        setEmailAddress(emailAddress);
        setID(id);
        setPasswordCopy(passwordCopy);
        setPasswordOriginal(passwordOriginal);
        
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    private void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getID() {
        return id;
    }

    private void setID(String id) {
        this.id = id;
    }
    public void addStuff(){
      //  System.out.print(stuffTypeString);
      //  System.out.print(personObj.dateOfBirth.toString());
        try {
             DatabaseConnection databaseConnection = new DatabaseConnection();
        String query = "INSERT INTO StuffTable (StuffID, FirstName, LastName, PassportNumber,DateofBirth, EmailAddress,StuffType) VALUES('"+id+"','"+personObj.getFirstName()+"','"+personObj.getLastName()+"','"+personObj.getPassportNumber()+"','"+personObj.dateOfBirth.toString()+"','"+emailAddress+"','"+stuffTypeString+"')";
        databaseConnection.storeData(query);
        } catch (Exception e) {
        System.out.println("Your id should be number format");
        }
 
     
        
    }
    public Stuff(String emailAddress, String ID){
        setEmailAddress(emailAddress);
        setID(ID);
    }
        public Person getPersonObj() {
        return personObj;
    }

    private void setPersonObj(Person personObj) {
        this.personObj = personObj;
    }
 

    public String getStuffTypeString() {
        return stuffTypeString;
    }

    public void setStuffTypeString(String stuffTypeString) {
        this.stuffTypeString = stuffTypeString;
    }
    private String emailAddress;
    private String id;
private Person personObj;
private String stuffTypeString;

    public String getPasswordOriginal() {
        return passwordOriginal;
    }

    public void setPasswordOriginal(String passwordOriginal) {
        this.passwordOriginal = passwordOriginal;
    }

    public String getPasswordCopy() {
        return passwordCopy;
    }

    public void setPasswordCopy(String passwordCopy) {
        this.passwordCopy = passwordCopy;
    }
private String passwordOriginal;
private String passwordCopy;
    


    
}
