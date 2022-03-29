package bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class House  implements Serializable  {
    private int  constrYear;
    private double price;
}
