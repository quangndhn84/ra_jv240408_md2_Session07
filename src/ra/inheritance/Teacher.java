package ra.inheritance;

public class Teacher extends Person{
    private String teacherId;
    private String specialize;

    public Teacher() {
    }

    public Teacher(String teacherId, String specialize) {
        this.teacherId = teacherId;
        this.specialize = specialize;
    }

    public Teacher(String personId, String name, int age, String address, boolean sex, String phone, String email, String teacherId, String specialize) {
        super(personId, name, age, address, sex, phone, email);
        this.teacherId = teacherId;
        this.specialize = specialize;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public void helloStudent(String studentName){
        super.hello();
        System.out.println(studentName);
    }
}
