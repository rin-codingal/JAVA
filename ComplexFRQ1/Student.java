package ComplexFRQ1;

import java.util.ArrayList;

class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public double getGPA() {
        if (courses.isEmpty()) return 0.0;

        double total = 0;
        for (Course course : courses) {
            total += course.getGrade();
        }
        return total / courses.size();
    }

    public String getTranscript() {
        StringBuilder transcript = new StringBuilder();
        transcript.append("Name: ").append(name).append("\n");
        transcript.append("ID: ").append(id).append("\n");

        for (Course course : courses) {
            transcript.append("Course: ")
                      .append(course.getName())
                      .append(" (").append(course.getCredits()).append(" credits)\n")
                      .append("Grade: ")
                      .append(course.getGrade())
                      .append(" (").append(course.getLetterGrade()).append(")\n\n");
        }
        return transcript.toString();
    }
}
