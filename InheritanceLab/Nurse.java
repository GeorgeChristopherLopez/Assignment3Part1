public class Nurse extends  HospitalEmployee{
    int numPatients = 0;

    public Nurse(String name, int year, int numPatients) {
        super(name, year);
        this.numPatients = numPatients;
    }

    @Override
    public String toString() {
        return this.name + " " + this.year + " has " + numPatients + " patients";
    }


    @Override
    public void work() {
        System.out.println (this.name + " works for the hospital. " + this.name + " is a nurse with "+numPatients + " patients.");
    }
}
