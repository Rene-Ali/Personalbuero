package wien.codersbay.rg.personalbuero.models;

import java.util.Date;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date hireDate;
    private double salary;


    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, Date dateOfBirth, Date hireDate, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    
}
