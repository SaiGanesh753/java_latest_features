package java_8_exmp.udemy.immutable;

/**
 * Mutable class
 */
public class AddressMutable {

    private String city;
    private String state;

    public AddressMutable(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressMutable{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
