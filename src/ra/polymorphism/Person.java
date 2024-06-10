package ra.polymorphism;

public class Person {
    /*
     * ĐIỀU KIỆN GHI ĐÈ
     * 1. Phải có quan hệ kế thừa
     * 2. Phải cùng kiểu dữ liệu trả về, tên phương thức, tham số
     * 3. Bổ từ truy cập của phương thức ghi đề có phạm vi lớn hơn hoặc bằng
     * phương thức bị ghi đè
     * */
    protected void helloTeacher(String teacherName) {
        System.out.println("Nói giọng miền bắc: Xin chào" + teacherName);
    }
}
