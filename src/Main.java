
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        StudentManger manager = new StudentManger();
        int choice;
        do{
        System.out.println("\n----- Student Management -----");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
                switch(choice){
                case 1:
                    System.out.printf("Enter id student:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.printf("Enter full name: ");
                    String name = sc.nextLine();
                    System.out.printf("Enter GPA : ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();
                    
                   Student s = new Student(id, name, gpa);
                   manager.addStudent(s);
                   System.out.println("Add student successfully");
                   break;
                case 2 : 
                    System.out.printf("Enter your id want to delete: ");
                    int idDelete = sc.nextInt();
                    sc.nextLine();
                    
                    boolean total = manager.deleteStudentByID(idDelete);
                    
                    if(total == true){
                        System.out.println("Delete succesfully.");
                    }else{
                        System.out.println("No id can't found.");
                    }
                    break;
                case 3: 
                      System.out.print("Enter name to search: ");
                        String searchName = sc.nextLine();
                       Student search = manager.findStudentByName(searchName);
                        if (search == null) {
                            System.out.println("No students found.");
                        } else {
                            System.out.println(search.toString());
                            }
                        break;
                
                case 4 : 
                manager.displayAllStudents();
                break;
                
                case 0 :
                System.out.println("Exit");    
                        break;
                        
                default:
                System.out.println("Invalid choice.");    
        }
               
                
            }while(choice != 0);
            
            
                    
            }
}
    

