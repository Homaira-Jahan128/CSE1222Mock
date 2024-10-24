package q1;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker("Chandon",100);
        System.out.println(worker.toString());

        Supervisor supervisor = new Supervisor("Maisha",200000,"Sales");
        System.out.println(supervisor.toString());

        Director director = new Director("Luba",500000,"Operations");
        System.out.println(director.toString());


    }
}
