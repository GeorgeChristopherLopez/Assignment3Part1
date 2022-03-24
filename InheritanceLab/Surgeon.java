public class Surgeon extends Doctor{

    boolean operating = false;
    public Surgeon(String name, int year, String specialty, boolean operating) {
        super(name, year, specialty);
        this.operating = operating;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + specialty + " Operating:" + operating;
    }

    @Override
    public void work() {
        if(this.operating == true) {
            System.out.println (this.name + " works for the hospital. " + this.name + " is operating now.");
        } else {
            System.out.println (this.name + " works for the hospital. " + this.name + " is not operating now.");
        }

    }
}
