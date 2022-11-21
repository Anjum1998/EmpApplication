import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int code;
    String name;
    String designation;
    double salary;
    String companyName;
    long phoneNo;
    String emailId;

    public Employee(int code, String name, String designation, double salary, String companyName, long phoneNo, String emailId) {
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.companyName = companyName;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
    }
}
    public class Employ {

        public static void main(String[] args) {

            ArrayList<Employee> arr=new ArrayList<Employee>();
            while(true) {
                System.out.println("Select an option \n 1.Add Employee \n 2.View Employee \n 3.Search Employee \n 4.Delete Employee \n 5.Exit");
                Scanner sc=new Scanner(System.in);
                int option=sc.nextInt();

                switch (option)

                {
                    case 1:
                        System.out.println("Enter employee details ");
                        System.out.println("Enter the code");
                        int code = sc.nextInt();
                        System.out.println("Enter name");
                        String name = sc.next();
                        System.out.println("Enter designation");
                        String designation = sc.next();
                        System.out.println("Enter the salary");
                        double salary = sc.nextDouble();
                        System.out.println("Enter company name");
                        String companyName = sc.next();
                        System.out.println("Enter phone No");
                        long phnNo= sc.nextLong();
                        System.out.println("Enter email Id");
                        String emailId = sc.next();
                        Employee s=new Employee(code,name,designation,salary,companyName,phnNo,emailId);
                        arr.add(s);
                        break;
                    case 2:
                        System.out.println("Display Employee Details...");
                        for (Employee emp : arr) {

                            System.out.println(emp.code);
                            System.out.println(emp.name);
                            System.out.println(emp.designation);
                            System.out.println(emp.salary);
                            System.out.println(emp.companyName);
                            System.out.println(emp.phoneNo);
                            System.out.println(emp.emailId);
                        }
                        break;
                    case 3:
                        System.out.println("Enter the employee code");

                        int emp1 = sc.nextInt();
                        for (Employee e1 : arr) {
                            if (emp1 == e1.code){
                                System.out.println("Employee Found");
                                System.out.println("Details of employee");
                                System.out.println(e1.code);
                                System.out.println(e1.name);
                                System.out.println(e1.designation);
                                System.out.println(e1.salary);
                                System.out.println(e1.companyName);
                                System.out.println(e1.phoneNo);
                                System.out.println(e1.emailId);
                                break;
                            }
                            else {
                                System.out.println("No such employee found");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Enter the employee code");
                        Scanner obj2 = new Scanner(System.in);
                        int empCode= obj2.nextInt();
                        for (Employee e1 : arr){
                            if (empCode == e1.code){
                                arr.remove(e1);
                                break;

                            }
                        }
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("invalid choice");



                }

            }
            }
        }


