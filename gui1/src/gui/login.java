package gui;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
public class login {
    private String name;
    private String phoneNumber;
    private String email;
    private String city;
    private String message; //
    private boolean f; // اتاكد من القيم
    {
        message = ""; // instance block
        name = "";
        email = ""; // بين double qoute  عشان اتجنب ال null
        phoneNumber = "";
        city = "";
        f = true;
    }
    public String getMessage() {
        return message;
    }
    public login(String name, String phoneNumber, String email, String city) { 
        this(name, phoneNumber , email);
        setCity(city);
    }//2 constractor  1 fe el 3 3l asasen w 1 fe name ,phone,email
    public login(String name, String phoneNumber, String email) {
        setname(name);
        setPhoneNumber(phoneNumber);
        setemail(email);
    }
    public String getname() {
        return name.trim(); //remove space
    }
    public void setname(String name) {
        if ( name.isEmpty()==false && name.trim().length() >= 10 ) {
            this.name = name.trim();
        } else {
            message += "Full name is invalid\n";
            f = false;
        } 
    }
    public String getPhoneNumber() {
        return phoneNumber.trim();
    }
    public void setPhoneNumber(String phoneNumber) {
        if (Pattern.matches("((\\+201)|(201)|(01))[0125]\\d{8}$", phoneNumber.trim())) {
            this.phoneNumber = phoneNumber;            
        } else {
            message += "Phonenumber is invalid\n";
            f = false;
        }
    }
    public String getemail() {
        return email.trim();
    }
    public void setemail(String email) {
        if (Pattern.matches("[a-z0-9]{5,20}@[a-z]{3,6}\\.[a-z]{3,6}$", email.trim())) {
            this.email = email.trim();        
        } else {
            message += "email is invalid\n";
            f = false;
        } 
    }
    public String getCity() {
        return city.trim();
    }
    public void setCity(String city) {
        if (city.trim().length() < 20 || city.trim().length() > 3 ) {
            this.city = city;
        } else {
            message += "City is invalid";
            f = false;
        }
    }
    public boolean i(){ // عشان اتأكد من القيم
        return f;
    }   
}
