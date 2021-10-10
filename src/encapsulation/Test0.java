package encapsulation;

public class Test0 {
	
	String name="John";
	int id=100;
    int phnum=97876656;
    double salary=90.078;
    

	public int getPhnum() {
		return phnum;
	}

	public void setPhnum(int phnum) {
		this.phnum = phnum;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println("current salary "+t.getSalary());
		t.setSalary(100.098);
		System.out.println("updated salary "+t.getSalary());
		System.out.println("current phone num "+t.getPhnum());
		t.setPhnum(123456);
		System.out.println("updated phone num "+t.getPhnum());
	}

}
