import java.util.Random;
public class Worker {
	int id;
	String first_name;
	String last_name;
	String Email;
	String Phone;
	String Address;
	static int index=0;
	int salary;
	public Worker() {
		Random rand=new Random();
		this.first_name="John"+index;
		this.last_name="Doe"+index;
		this.Email="John"+index+"@gmail.com";
		this.Phone="050-1234567";
		this.Address="None";
		this.salary=rand.nextInt(15000)+3000;
		this.id=index;
		index+=1;
	}
	@Override
	public String toString() {
		return "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", Email=" + Email
				+ ", Phone=" + Phone + ", Address=" + Address + ", salary=" + salary;
	}
	
}
