public class StudentRunner {
    public static void main(String[] arg) {
        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());
    }
}
