public class User {

    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    
    
    
    
    public User(String firstName, String lastName, String email, Gender gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  String getEmail() {
        return email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  String getLastName() {
    return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public  String getFirstName() {
    return firstName; }
}
