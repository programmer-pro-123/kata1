package software.ulpgc;

public class Main {
    public static void main(String[] args) {
        Task task = new Task(1, 2, "example");

        System.out.println("Beginning: " + task.getBeginning() + " End: " + task.getEnd() +
                "\nDescription: " + task.getDescription() + "\nTime Limit: " + task.timeLimit());

        task.setBeginning(27);
        task.setEnd(29);
        task.setDescription("'Two branches the same tree' Mr.Miyagi");

        System.out.println("Beginning: " + task.getBeginning() + " End: " + task.getEnd() +
                "\nDescription: " + task.getDescription() + "\nTime Limit: " + task.timeLimit());
    }
}
