package ra.polymorphism;

public class Student extends Person {
    /*
     * ĐIÊU KIỆN NẠP CHỒNG
     * 1. Các phương thức có cùng tên trong cùng 1 lớp
     * 2. Các kiểu nạp chồng
     *   - Số lượng tham số khác nhau
     *   - Thay đổi thứ tự tham số
     *   - Thay đổi kiểu dữ liệu các tham số
     *   - Kiểu dữ liệu trả về khác nhau????--> SAI
     * */

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public float add(float number1, float number2) {
        return number1 + number2;
    }

    public int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public void printInfo(int number, String str) {
        System.out.println(str + number);
    }

    public void printInfo(String str, int number) {
        System.out.println(str + number);
    }

    public void helloTeacher(String teacherName) {
        System.out.println("Nói giọng miền nam: Xin chào " + teacherName);
    }

    public String toString(){
        return "Thông tin sinh viên";
    }
}
