package midterm;

public class UniversityTester {
    public static void main(String[] args) {
        // Create a University instance
        University university = new University();

        // Create some Professor instances
        Professor professor1 = new Professor("John Doe", 45);
        Professor professor2 = new Professor("Jane Smith", 38);
        Professor professor3 = new Professor("Michael Johnson", 52);

        // Add professors to the university
        university.addProfessor(professor1);
        university.addProfessor(professor2);
        university.addProfessor(professor3);

        // Print the added professors
        System.out.println("// Professors after addition:");
        for (Professor professor : university.getProfessors()) {
            System.out.println(professor.getName() + ", " + professor.getAge());
        }

        university.removeProfessor(professor2);

        // Print the list after removing
        System.out.println("// Professors after removal of one:");
        for (Professor professor : university.getProfessors()) {
            System.out.println(professor.getName() + ", " + professor.getAge());
        }

        // Save the university state to a file
        university.saveState();
        System.out.println("// University state saved to state.csv");

        // Clear the university's professors list
        university.getProfessors().clear();
        System.out.println("// Professors list cleared");

        // Print the list after clearing to show that it really did clear
        System.out.println("// Professors after clearing:");
        for (Professor professor : university.getProfessors()) {
            System.out.println(professor.getName() + ", " + professor.getAge());
        }

        // Restore the university state from the file
        university.restoreState();
        System.out.println("// University state restored from state.csv");

        // Print the restored professors
        System.out.println("// Professors after restoration:");
        for (Professor professor : university.getProfessors()) {
            System.out.println(professor.getName() + ", " + professor.getAge());
        }
    }
}