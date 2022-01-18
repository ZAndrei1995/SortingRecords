import java.util.*;

public class Main {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee("John","Johnson","Manager","2016 12 31");
        Employee secEmployee = new Employee("Tou","Xiong","Software Engineer","2016 10 05");
        Employee thirdEmployee = new Employee("Michaela","Michaelson","District Manager","2015 12 19");
        Employee forthEmployee = new Employee("Jake","Jacobson","Programmer"," ");
        Employee fifthEmployee = new Employee("Jacquelyn","Jackson","DBA"," ") ;
        Employee sixEmployee = new Employee("Sally","Weber","Web Developer","2015 12 18") ;

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(firstEmployee) ;
        employeeList.add(secEmployee) ;
        employeeList.add(thirdEmployee) ;
        employeeList.add(forthEmployee) ;
        employeeList.add(fifthEmployee) ;
        employeeList.add(sixEmployee) ;

        sortEmployeeLastName(employeeList);
        System.out.println(employeeList);
        System.out.println();

        sortEmployeePosition(employeeList);
        System.out.println(employeeList);
        System.out.println();

        sortEmployeeSeparationDate(employeeList);
        System.out.println(employeeList);

    }

    public static void sortEmployeeLastName (List<Employee> employeeList ) {
        Collections.sort(employeeList, new Comparator<>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        int result = o1.getLastName().compareToIgnoreCase(o2.getLastName());
                        if (result != 0) {
                            return result;
                        }
                        return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
                    }
                }
        );
    }

    public static void sortEmployeePosition ( List<Employee> employeeList ) {
        Collections.sort(employeeList, new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int result = o1.getEmployeePosition().compareToIgnoreCase(o2.getEmployeePosition());
                if (result != 0) {
                    return result;
                }
                return result;
            }
        });
    }

    public static void sortEmployeeSeparationDate ( List<Employee> employeeList ) {
        Collections.sort(employeeList, new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int result = o1.getSeparationDate().compareToIgnoreCase(o2.getSeparationDate());
                if (result != 0) {
                    return result;
                }
                return result;
            }
        });
    }

}
