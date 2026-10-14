public class BMI {
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches

    /** Creates a BMI object with the specified name, age, weight, and height */
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    /** Creates a BMI object with the specified name, weight, height, and a default age 20 */
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    /** BMI = weight (pounds) * 703 / height (inches)^2 */
    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
