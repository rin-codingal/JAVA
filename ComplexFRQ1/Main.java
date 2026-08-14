package ComplexFRQ1;

public class Main {
    public static void main(String[] args) {
        // Alice
        Course cs = new Course("Computer Science", 4);
        cs.setGrade(3.7);

        Student alice = new Student("Alice", 1234);
        alice.addCourse(cs);
        System.out.println("Alice's Initial GPA: " + alice.getGPA());

        Course math = new Course("Math", 3);
        alice.addCourse(math);
        math.setGrade(4.0);
        System.out.println("Alice's Updated GPA: " + alice.getGPA());

        // Bob
        Course csBob = new Course("Computer Science", 4);
        csBob.setGrade(3.0);

        Course mathBob = new Course("Math", 3);
        mathBob.setGrade(3.5);

        Student bob = new Student("Bob", 5678);
        bob.addCourse(csBob);
        bob.addCourse(mathBob);

        System.out.println("\nBob's GPA: " + bob.getGPA());
        System.out.println("Bob's Transcript:\n" + bob.getTranscript());
    }
}
