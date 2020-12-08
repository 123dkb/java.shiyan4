# java.xuefei<br>
接口程序实验要求掌握抽象类和抽象方法的定义<br>;
掌握java接口的定义，定义形式及其接口的实现方式<br>;
初步了解使用异常类的构造方法<br>;
首先构造两个抽象类<br>;
分别是学生；<br>;
abstract方法只允许声明，不允许实现，且abstract方法必须是实例方法所以构造学生的两个抽象如下<br>;
例如：
public interface Student{
	 public abstract void setTuition(int Tuition); <br>;
	  public abstract void getTuition(int Tuition);<br>;
接口由类来实现一边使用接口的方法，一个类需要在类声明中使用关键字implements声明该类实现一个或多个接口如果实现多个接口需要用逗号隔开接口名<br>;
例如：public class Shb implements Student,Teacher<br>;
如果一个非抽象类实现了该接口，那么这个类必须重写这个接口的所有方法，所以类在重写接口方法是不仅要去掉abstract修饰符<br>;给出方法体，而且方法的访问权限一定要明显使用public来修饰。<br>;实现接口的非抽象类实现了该接口中的方法，即给出了方的具体行为功能<br>;
例如：public class Shb implements Student,Teacher{<br>;
	String Name;<br>;
	String Sex;<br>;
	 int Age;<br>;
	 int Tuition;<br>;
	 int salary;<br>;
	
	
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
<br>;
异常就是程序运行时可能出现的错误，使用try-catch语句来处理异常，将可能出现的异类操作放在try-catch语句的try部分一旦try部分抛出异类对象，或调用某个可能抛出异类对象的方法，try部分即结束通过catch语句部分完成异常处理；<br>;
例如： try {<br>;
   System.out.println("请输入年薪：");<br>;  
   int Salary =s.nextInt();<br>;
   stu.setSalary(Salary);<br>;
   System.out.println("请输入学费：");<br>;
   int Tuition =s.nextInt();<br>;
   stu.setTuition(Tuition);<br>;
   
    System.out.println("年薪为" + stu.salary + "     减去学费" + stu.Tuition + "      等于" + (stu.salary - stu.Tuition));
    System.out.println("纳税金额为："+stu.salary*0.03);
  }
   catch(Exception e) {<br>;
    System.out.println("异常数据");<br>;
    <br>;
   这是需要我们通读学习成员变量的隐藏和方法重写部分使用abstract类的方法，课前的预习课上的理论讲解让我初步了解实验的内容，让我们能更好的完成这次实验
