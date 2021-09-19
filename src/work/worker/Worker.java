package work.worker;
import work.Employee;
import work.IWork;

/**
 * The class for the worker.
 */
public class Worker extends Employee implements IWork {
    public Worker(String name){
        this.name = name;
    }
    @Override
    public String getJobTitle(Employee employee) {
        return employee.name + " " + employee.getClass();
    }

    @Override
    public String toString(){
        return this.getJobTitle(this);
    }
}
