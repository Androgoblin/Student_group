package hw3;

public class Student  extends User {
    private int studentId;

    public Student(String lastName, String firstName, String secondName, int studentId) {
        super(lastName, firstName, secondName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "Имя: " + super.getFirstName() +
                ", Отчество: " + super.getSecondName() +
                ", Фамилия: " + super.getLastName() +
                ", Идентификатор: " + studentId;
    }
}
