package java_8_exmp.udemy.immutable;

/**
 * Immutable class with mutable class property.
 */
final public class StudentImmutable {

    final private int id;
    final private String name;

    final AddressMutable addressMutable;//Mutable class

    public StudentImmutable(int id, String name, AddressMutable addressMutable) {
        this.id = id;
        this.name = name;
        this.addressMutable = addressMutable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AddressMutable getAddressMutable() {
        return new AddressMutable(addressMutable.getCity(), addressMutable.getState());
    }

    @Override
    public String toString() {
        return "StudentImmutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressMutable=" + addressMutable +
                '}';
    }
}
