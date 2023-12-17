public class Student {
    // Attributes of the Student class
    private String name;
    private int age;
    private String major;
    private String institution;
    private String city;
    private int number;

    // Constructor to initialize the attributes with default values
    public Student() {
        this.name = "Hiba";
        this.age = 19;
        this.major = "Digital development";
        this.institution = "ISGI";
        this.city = "Marrakech";
        this.number = 1;
    }

    // Method to display information about the student
    public void info() {
        System.out.println("Student " + this.number + " : ");
        System.out.println("- Name: " + this.name);
        System.out.println("- Age: " + this.age);
        System.out.println("- Major: " + this.major);
        System.out.println("- Institution: " + this.institution);
        System.out.println("- City: " + this.city);
    }

    // The main method, entry point of the program
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student1 = new Student();
        // Calling the info method of the student1 object to display information
        student1.info();
    }
}
