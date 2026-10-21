package software.ulpgc;

public class Main {
    public static void main(String[] args) {
         Task task = new Task(1,2, "message");

         System.out.println("Beginning: " + task.getBeginning() + " End: " + task.getEnd() + "\nDescription: " +
                 task.getDescription() + "\nTime Limit: " + task.timeLimit());

         task.setBeginning(27);
         task.setEnd(31);
         task.setDescription("New message");

        System.out.println("Beginning: " + task.getBeginning() + " End: " + task.getEnd() + "\nDescription: " +
                task.getDescription() + "\nTime Limit: " + task.timeLimit());
    }
}
