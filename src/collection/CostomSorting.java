package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CostomSorting {

    public static void main(String[] args) {

        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"Ahmed",30000.00));
        employees.add(new Employee(3,"rahul",40000.00));
        employees.add(new Employee(2,"ravi",25000.00));

        //tradional way of sorting
       // Collections.sort(employees,new SalaryComparator ());

        //System.out.println(employees);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary()- o2.getSalary());
//            }
//        });
       // System.out.println(employees);

        //java 8 for sorting
        Collections.sort(employees,(o1, o2) -> (int) (o1.getSalary()- o2.getSalary()));
        System.out.println(employees);

        Collections.sort(employees,(o1, o2) ->  (o1.getName().compareTo(o2.getName())));
        System.out.println(employees);

        Collections.sort(employees,(o1, o2) ->  (o1.getId()-o2.getId()));
        System.out.println(employees);
    }
}
class SalaryComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()- o2.getSalary());
    }
}

