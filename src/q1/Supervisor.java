package q1;

public class Supervisor extends Worker{
    private String division;

    public Supervisor(String name, double wage,String division) {
        super(name, wage);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    @Override
    public String toString() {
        return "Supervisor Name: " + name + "\n" + "Wadge:" + wage
                + "\n" + "Division: " + division + "\n";
    }
}
