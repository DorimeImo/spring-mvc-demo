package mvcdemo.model;


import javax.validation.constraints.*;

public class Student {

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @Pattern(regexp = "[a-zA-Z]+", message = "wrong input")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    @Pattern(regexp = "[a-zA-Z]+", message = "wrong input")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 3, message = "you cant spend less than 3 hours- it is inefficiently")
    @Max(value = 50, message = "you cant spend more than 30 hours- it is dangerous")
    private Integer hoursInProgrammingPerWeek;

    private String country;

    private String favouriteLanguage;

    private String[] operatingSystems;

    public Integer getHoursInProgrammingPerWeek() {
        return hoursInProgrammingPerWeek;
    }

    public void setHoursInProgrammingPerWeek(Integer hoursInProgrammingPerWeek) {
        this.hoursInProgrammingPerWeek = hoursInProgrammingPerWeek;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
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

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
