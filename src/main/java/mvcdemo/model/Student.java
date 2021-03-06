package mvcdemo.model;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @Pattern(regexp = "[a-zA-Z]+", message = "wrong input")
    @Column(name = "first_name")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @Pattern(regexp = "[a-zA-Z]+", message = "wrong input")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @Pattern(regexp = ".+@.+\\..+", message = "wrong input")
    @Column(name = "email")
    private String email;


    public Student(@NotNull(message = "is required") @Size(min = 1, message = "is required") @Pattern(regexp = "[a-zA-Z]+", message = "wrong input") String firstName, @NotNull(message = "is required") @Size(min = 1, message = "is required") @Pattern(regexp = "[a-zA-Z]+", message = "wrong input") String lastName, @NotNull(message = "is required") @Size(min = 1, message = "is required") String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
