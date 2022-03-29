package bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private String name, surname;
    private int age, offeredYear;
    private double salary;

    public Customer() {
    }


}
