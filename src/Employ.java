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
            int ex;
            ArrayList<Employee> arr=new ArrayList<Employee>();
            do {
                Scanner sc=new Scanner(System.in);
                int option=sc.nextInt();

                switch (option)
                {
                }


                System.out.println("Do you Want to continue?1.yes 2.No");
                ex=sc.nextInt();
            }while (ex==1);
            }
        }


