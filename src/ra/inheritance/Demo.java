package ra.inheritance;

public class Demo extends Student{
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.getAvgMark();//Student
        demo.getName();//Person
        Student objStudent = new Student();
        System.out.println(objStudent instanceof Student);
    }
}
