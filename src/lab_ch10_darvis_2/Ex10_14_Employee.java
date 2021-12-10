package lab_ch10_darvis_2;

public abstract class Ex10_14_Employee {
    private final String firstName;
    private final String lastName;
    private final String ID;

    public Ex10_14_Employee(String firstName, String lastName, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s", "Сотрудник", firstName, lastName,
                "ID", ID);
    }
    public abstract double earnings(); // no implementation here
}
