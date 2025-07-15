class Employee{
    int empNo;
    String empName;
    String joinDate;
    char designationCode;
    String department;
    int basic;
    int HRA;
    int IT;

    public Employee(int empNo,String empName,String joinDate,char designationCode,String department,int basic,int HRA,int IT){
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.HRA = HRA;
        this.IT = IT;
    }

}

class Project{
    public static void main(String args[]){
        if(args.length == 0){
            System.out.println("Please enter the employee details");
            return;
        }

        int empId = Integer.parseInt(args[0]);

        Employee[] employees = {
            new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
            new Employee(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400),
            new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
        };

        boolean found = false;

        for(Employee emp : employees){
            if(emp.empNo == empId){
                found = true;
                String designation = "";
                int da = 0;

                switch(emp.designationCode){
                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;

                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;

                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;

                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;

                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;

                    default :
                        designation = "Unknown";
                        break;

                }

                int salary = emp.basic + emp.HRA + da - emp.IT;

                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(emp.empNo + "\t" + emp.empName + "\t\t" + emp.department + "\t\t" + designation + "\t\t" + salary );
                break;
            }
        }
        if(!found){
            System.out.println("There is no employee with empid : "+ empId);
        }

    }
}