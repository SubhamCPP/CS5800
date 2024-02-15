public class Main {
    public static void main(String[] args) {
        // Instructors
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor alice = new Instructor("Alice", "Johnson", "4-2048"); // New instructor for Advanced Software Engineering

        // Textbooks for Advanced Software Engineering
        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook effectiveJava = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley"); // Second textbook

        // Advanced Software Engineering course with one instructor and one textbook initially
        Course advancedSoftwareEngineering = new Course("Advanced Software Engineering");
        advancedSoftwareEngineering.addInstructor(nima);
        advancedSoftwareEngineering.addTextbook(cleanCode);

        // Printing details for Advanced Software Engineering with one instructor and one textbook
        System.out.println("=== Advanced Software Engineering Course (Initial) ===");
        advancedSoftwareEngineering.printCourseDetails();

        // Adding a second instructor and a second textbook to the Advanced Software Engineering course
        advancedSoftwareEngineering.addInstructor(alice);
        advancedSoftwareEngineering.addTextbook(effectiveJava); // Adding the second textbook

        // Printing details for Advanced Software Engineering with two instructors and two textbooks
        System.out.println("\n=== Advanced Software Engineering Course (Updated) ===");
        advancedSoftwareEngineering.printCourseDetails();
    }
}
