package software.ulpgc;

public class Main {
    public static void main(String[] args) {
        Task task = new Task(7, 13, "Hello World");

        System.out.println("Beginning: " + task.getBeginning() + " End: " + task.getEnd() +
                "\nDescription: " + task.getDescription() + "\nTime Limit: " + task.timeLimit());

        task.setBeginning(27);
        task.setEnd(210);
        task.setDescription("Hello Word again, this is an example");

        System.out.print("\n");
        System.out.println("Beginning: " + task.getBeginning() + " End: " + task.getEnd() +
                "\nDescription: " + task.getDescription() + "\nTime Limit: " + task.timeLimit());
    }
}
