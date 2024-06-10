package ra.inheritance;

public class Person {
    private String personId;
    private String name;
    private int age;
    private String address;
    private boolean sex;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String personId, String name, int age, String address, boolean sex, String phone, String email) {
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void hello() {
        System.out.println("Xin chào");
    }

    public int addTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
