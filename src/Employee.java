import java.util.Date;

public class Employee {

    private String firstName ;
    private String lastName ;
    private String employeePosition ;
    private String separationDate ;

    public Employee(String fName, String lName, String ePosition, String sDate) {

        if ( fName != null && lName != null && ePosition != null && sDate != null ) {
            this.firstName = fName ;
            this.lastName = lName ;
            this.employeePosition = ePosition ;
            this.separationDate = sDate ;
        }else {
            System.out.println("Invalid Data");
        }

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

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public String getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }

    public String toString ( ) {
        return this.firstName + " " + this.lastName + " " + this.employeePosition + " " + this.separationDate + "\n";
    }

}
