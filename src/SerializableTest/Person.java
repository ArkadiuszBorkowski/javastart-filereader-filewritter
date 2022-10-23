package SerializableTest;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 9097827526759521431L;

    private transient String firstName;   //dane nie są serializowane bo użyto słowa transient
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
