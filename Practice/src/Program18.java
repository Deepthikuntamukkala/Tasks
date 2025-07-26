class Employee{
	String name;
	static int c=0;
	
	Employee(String name,int id){
		this.name=name;
		c++;
		}
	void display() {
		System.out.println("name:"+name);
	}
}
public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);
        
        
        emp1.display();
        emp2.display();
        emp3.display();
        System.out.println("Total number of employees: " + Employee.c);



	}

}
