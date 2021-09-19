package work.accountant;
import work.Employee;
import work.IWork;
/**
 * The class for the accountant.
 */
public class Accountant extends Employee implements IWork {

    public Accountant(String name){
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
