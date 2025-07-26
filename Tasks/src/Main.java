import model.Student;
import service.StudentService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.name="Deepthi";
		s.rollno=9;
		StudentService ss=new StudentService();
		ss.displayStudent(s);

	}

}
