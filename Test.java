import java.util.Scanner;

public class Test {

 
 public static void main(String[] args) {
  // TODO Auto-generated method stub
 Shb stu=new Shb();
 Shb stu2=new Shb();
  
  stu.Name = "老李";
  stu.Sex= "女";
  stu.Age = 3;
  System.out.println("学生姓名："+stu.Name);
  System.out.println(" 性别："+stu.Sex);
  System.out.println(" 年龄："+stu.Age+"岁");
  System.out.println("----------------------");
  Scanner s=new Scanner(System.in);



  try {
   System.out.println("请输入年薪：");  
   int Salary =s.nextInt();
   stu.setSalary(Salary);
   System.out.println("请输入学费：");
   int Tuition =s.nextInt();
   stu.setTuition(Tuition);
   
    System.out.println("年薪为" + stu.salary + "     减去学费" + stu.Tuition + "      等于" + (stu.salary - stu.Tuition));
    System.out.println("纳税金额为："+stu.salary*0.03);
  }
   catch(Exception e) {
    System.out.println("异常数据");
    
   }
  System.out.println("-------------------------------------------");
  stu2.Name = "杨洁";
  stu2.Sex= "女";
  stu2.Age = 24;
  System.out.println("学生姓名："+stu2.Name);
  System.out.println(" 性别："+stu2.Sex);
  System.out.println(" 年龄："+stu2.Age+"岁");
  System.out.println("----------------------");



  try {
   System.out.println("请输入年薪：");  
   int Salary =s.nextInt();
   stu2.setSalary(Salary);
   System.out.println("请输入学费：");
   int Tuition =s.nextInt();
   stu2.setTuition(Tuition);
   if(Tuition>0) {
    System.out.println("年薪" + stu2.salary + "     减去学费" + stu2.Tuition + "      等于" + (stu2.salary - stu2.Tuition));
    System.out.println("您的纳税金额为："+stu2.salary*0.03);
    
   }else {System.out.println("你好！数据异常，学费不能等于0,请重新填写学费金额");}
   
    
  }
   catch(Exception e) {
    System.out.println("异常数据");
    
   }
  
  }
 }