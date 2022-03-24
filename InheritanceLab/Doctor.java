public class Doctor extends HospitalEmployee{
    String specialty;

    public Doctor(String name, int year, String specialty) {
        super(name, year);
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + specialty;
    }

    @Override
    public void work() {
        System.out.println (this.name + " works for the hospital. " + this.name + " is a(n) "+specialty + " doctor.");
    }
}
