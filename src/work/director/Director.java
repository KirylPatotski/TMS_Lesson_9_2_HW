package work.director;
import work.Employee;
import work.IWork;
/**
 * The class for the director.
 */
public class Director extends Employee implements IWork {

        public Director(String name){
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
