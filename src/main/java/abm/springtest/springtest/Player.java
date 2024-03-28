package abm.springtest.springtest;

//import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter 
@Getter
public class Player {

    private Integer id;
    //@Setter(AccessLevel.NONE)
    private String name;
    private String country;
    private double avg;
    private int mom;

}
