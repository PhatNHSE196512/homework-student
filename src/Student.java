
public class Student {
    private int studentId;
    private String fullName;
    private double GPA;

    public Student(int studentId, String fullName, double GPA) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.GPA = GPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-30s %.2f", studentId, fullName, GPA);
    }
    
    
}
