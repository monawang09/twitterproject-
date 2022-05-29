package mona.Small_Twitter.Users;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")

public class Users implements Serializable {
    private static final long serialVersionUID = -2343243243242432341L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "userID")
    private String userID;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "birthday")
    // Additional Parameter that the Users has the option
    private String birthday;

    @Column(name = "address")
    private String address;

    //Constructors
    public Users(){
    }

    public Users(String userID, String email, String password) {
        this.userID = userID;
        this.email = email;
        this.password = password;
    }

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Users(String userID, String email, String password, String birthday, String address) {
        this.userID = userID;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
    }

    public Users(String email, String password, String birthday, String address) {
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
    }

    // Getter and Setter Pair for Java

    public String getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }


    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Users{" +
                ", userID='" + userID + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
