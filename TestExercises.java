public class TestExercises {
    public static void main(String[] args) {
        // Exercise 2.0: Loan
        Loan loan1 = new Loan();
        System.out.println("--- Loan (default) ---");
        System.out.println("Rate: " + loan1.getAnnualInterestRate()
                + ", Years: " + loan1.getNumberOfYears()
                + ", Amount: " + loan1.getLoanAmount());
        System.out.println("Date: " + loan1.getLoanDate());
        System.out.printf("Monthly payment: %.2f%n", loan1.getMonthlyPayment());
        System.out.printf("Total payment: %.2f%n", loan1.getTotalPayment());

        Loan loan2 = new Loan(5.0, 15, 100000);
        System.out.println("--- Loan (5.0%, 15 years, 100000) ---");
        System.out.printf("Monthly payment: %.2f%n", loan2.getMonthlyPayment());
        System.out.printf("Total payment: %.2f%n", loan2.getTotalPayment());

        // Exercise 2.1: BMI
        BMI bmi1 = new BMI("Ahmed", 18, 145, 70);
        BMI bmi2 = new BMI("Fatima", 215, 70);
        System.out.println("--- BMI ---");
        System.out.printf("%s (age %d): BMI %.2f, %s%n",
                bmi1.getName(), bmi1.getAge(), bmi1.getBMI(), bmi1.getStatus());
        System.out.printf("%s (age %d): BMI %.2f, %s%n",
                bmi2.getName(), bmi2.getAge(), bmi2.getBMI(), bmi2.getStatus());

        // Exercise 2.2: Course
        Course course = new Course("Java Programming");
        String[] names = {"Ali", "Hodan", "Yusuf", "Amina", "Omar", "Sahra"};
        for (String n : names) {
            course.addStudent(n); // 6 students > initial capacity 4, so the array grows
        }
        course.dropStudent("Yusuf");
        System.out.println("--- Course: " + course.getCourseName() + " ---");
        System.out.println("Number of students: " + course.getNumberOfStudents());
        for (String s : course.getStudents()) {
            System.out.println(" - " + s);
        }
    }
}
