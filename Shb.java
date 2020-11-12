
	public class Shb implements Student,Teacher{
	String Name;
	String Sex;
	 int Age;
	 int Tuition;
	 int salary;
	
	
	String getName()
	{ return Name; }
	public void setName(String Name)
	{this.Name = Name; }
	String getSex()
	{ return Sex; }
	public void setSex(String Sex)
	{this.Sex = Sex; }
	int getAge()
	{ return Age; }
	public void setAge(int Age)
	{this.Age = Age; }

	@Override
	public void setSalary(int Salary) {
		// TODO Auto-generated method stub
		this.salary = Salary;
		System.out.println("年收入是："+this.salary);
		
	}
	@Override
	public void getSalary(int Salary) {
		// TODO Auto-generated method stub
		this.salary = Salary;
		System.out.println("已查询到年收入是："+this.salary);
	}
	@Override

	public void setTuition(int Tuition) {
		// TODO Auto-generated method stub
		this.Tuition = Tuition;
		System.out.println("学费是："+this.Tuition);
	}
	@Override
	public void getTuition(int Tuition) {
		// TODO Auto-generated method stub
		this.Tuition = Tuition;
		System.out.println("已查询到学费是："+this.Tuition);
	}
	}



