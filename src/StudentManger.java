
import java.util.ArrayList;



public class StudentManger {
    private  ArrayList<Student> students = new ArrayList<>();
    
    public void addStudent(Student s){
        students.add(s);
    }
    private Student findStudentByID(int id) {
        for (int i = 0 ; i < students.size() ; i ++ ) {
            if (students.get(i).getStudentId() == id)
                return students.get(i);
        }
        return null;
    }
    public boolean deleteStudentByID(int id){
        Student s = findStudentByID(id);
        boolean total;
        if(s == null ){
            total =  false;
        }else{
            students.remove(s);
            total = true;
        }
            return total ;
        }
    public Student findStudentByName(String name){
        for (int i = 0 ; i < students.size() ; i ++ ) {
            if (students.get(i).getFullName().toLowerCase()== name.toLowerCase())
                return students.get(i);
        }
        return null;
    }
        public void displayAllStudents() {
        System.out.printf("%-10s %-30s %-5s\n", "ID", "Full Name", "GPA");
        for (Student s : students) {
            System.out.println(s);
        }
    }
   
    

}
    