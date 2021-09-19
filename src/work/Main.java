package work;
import work.accountant.Accountant;
import work.director.Director;
import work.worker.Worker;

/**
 * The main class to simulate the program's work.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director("Andrew");
        Worker worker = new Worker("Vladimir");
        Accountant accountant = new Accountant("Alex");


        System.out.println(accountant.toString());
        System.out.println(director.toString());
        System.out.println(worker.toString());
    }
}
