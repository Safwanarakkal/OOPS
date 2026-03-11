import java.util.Scanner;

public class EmployeeT {
    int empid;
    String name;
    float salary;
    String address;

    EmployeeT(){}

    EmployeeT(int empid,String name,float salary,String address){
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends EmployeeT{
    String department,subject;

    Teacher(int empid,String name,float salary,String address,String department,String subject){
        super(empid,name,salary,address);
        this.department = department;
        this.subject = subject;
    }

    public void display(){
        System.out.println("Teacher id: " + empid);
        System.out.println("Teacher name: " + name);
        System.out.println("Teacher salary: " + salary);
        System.out.println("Teacher Address: " + address);
        System.out.println("Teacher department: " + department);
        System.out.println("Teacher Subject: " + subject);
    }
}

class TeacherArrObjects{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of teachers ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher teacher[] = new Teacher[n];

        int tid;
        String name;
        float salary;
        String address;
        String department;
        String subject;

        for(int i=0;i<n;i++){
            System.out.println("Enter " + i + " teacher details...");

            System.out.println("Enter teacher id:");
            tid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter teacher name:");
            name = sc.nextLine();

            System.out.println("Enter teacher salary:");
            salary = sc.nextFloat();
            sc.nextLine();

            System.out.println("Enter teacher address:");
            address = sc.nextLine();

            System.out.println("Enter teacher department:");
            department = sc.nextLine();

            System.out.println("Enter teacher subject:");
            subject = sc.nextLine();

            teacher[i] = new Teacher(tid,name,salary,address,department,subject);
        }

        System.out.println("\nTeachers are:\n");

        for(Teacher x : teacher){
            x.display();
            System.out.println();
        }

        sc.close();
    }
}
