package software.ulpgc;

public class Main {
    public static void main(String[] args) {
        Task task = new Task(7, 13, "Hello World");

        System.out.println("Beginning: " + task.getBeginning() + " End: " + task.getEnd() +
                "\nDescription: " task.getDescription() + "\nTime Limit: " + task.timeLimit());
    }
}
