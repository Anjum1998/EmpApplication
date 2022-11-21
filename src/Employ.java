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
                }



            }
            }
        }


