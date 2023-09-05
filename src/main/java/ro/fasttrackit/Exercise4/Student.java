package ro.fasttrackit.Exercise4;

public class Student {
    private final String name;
    private final int grade;
    private static int totalGrades = 0;
    private static int totalStudents = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalGrades += grade;
        totalStudents++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static double calculateAverageGrade() {
        if (totalStudents == 0) {
            return 0; // Il suparam pe Allah daca impartim la 0
        }
        return (double) totalGrades / totalStudents;
    }
}
