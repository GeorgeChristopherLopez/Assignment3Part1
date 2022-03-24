public class HospitalEmployee {
    String name;
    int year;
    public HospitalEmployee(  String name,int year ){
        this.name = name;
        this.year = year;
    }

    public void work()
    {
        System.out.println (this.name + " works for the hospital.");
    }

    @Override
    public String toString() {
        return this.name + " " + this.year;
    }
}
