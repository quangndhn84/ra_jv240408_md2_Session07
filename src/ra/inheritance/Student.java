package ra.inheritance;

public class Student extends Person{
    private float avgMark;

    public Student() {
    }

    public Student(String personId, String name, int age, String address, boolean sex, String phone, String email, float avgMark) {
        super(personId, name, age, address, sex, phone, email);
        this.avgMark = avgMark;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }
}
