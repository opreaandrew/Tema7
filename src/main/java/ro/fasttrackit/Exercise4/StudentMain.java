package ro.fasttrackit.Exercise4;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Luke", 100);
        Student student2 = new Student("Leia", 95);
        Student student3 = new Student("Anakin", 150);

        System.out.println("Student 1: " + student1.getName() + ", Grade: " + student1.getGrade());
        System.out.println("Student 2: " + student2.getName() + ", Grade: " + student2.getGrade());
        System.out.println("Student 3: " + student3.getName() + ", Grade: " + student3.getGrade());

        double averageGrade = Student.calculateAverageGrade();
        System.out.println("Average Grade: " + averageGrade);
    }
}
