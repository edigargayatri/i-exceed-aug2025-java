
import java.io.*;

class employee  implements Serializable{
    String empname;
    int empId ;
     String designation;
     int salary;
    employee(String empname, int empId, String designation, int salary) {
        this.empname = empname;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
   }
}
class serializationDemo  {
    public static void main(String[] args) throws Exception {
        employee emp = new employee("Gayatri", 101, "Software Engineer", 1300000);
        // Serialization logic 
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File("employee.txt")));
        os.writeObject(emp);
        os.close();
        System.out.println("Employee object serialized successfully.");

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("employee.txt")));
        employee e = (employee) is.readObject();

        
        System.out.println("Employee Name: " + emp.empname);
        System.out.println("Employee ID: " + emp.empId);    
        System.out.println("Designation: " + emp.designation);
        System.out.println("Salary: " + emp.salary);
        
    }
}