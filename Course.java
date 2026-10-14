public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    /** Creates a course with the specified name */
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[4]; // initial capacity, grows when full
        this.numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    /** Adds a new student; creates a larger array if the current one is full */
    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] bigger = new String[students.length * 2];
            System.arraycopy(students, 0, bigger, 0, numberOfStudents);
            students = bigger;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    /** Drops a student; shifts the remaining students left to keep the array correct */
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                return; // student found and removed
            }
        }
    }

    /** Returns only the students currently enrolled (no empty slots) */
    public String[] getStudents() {
        String[] enrolled = new String[numberOfStudents];
        System.arraycopy(students, 0, enrolled, 0, numberOfStudents);
        return enrolled;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
