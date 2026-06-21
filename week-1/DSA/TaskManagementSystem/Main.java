import model.Task;
import service.TaskLinkedList;

public class Main {

    public static void main(String[] args) {

        TaskLinkedList tasks = new TaskLinkedList();

        tasks.addTask(101, "Design UI", "Pending");
        tasks.addTask(102, "Develop Backend", "In Progress");
        tasks.addTask(103, "Testing", "Pending");

        System.out.println("All Tasks");
        tasks.displayTasks();

        System.out.println("\nSearching Task 102");

        Task task = tasks.searchTask(102);

        if (task != null) {
            task.display();
        } else {
            System.out.println("Task Not Found");
        }

        System.out.println("\nDeleting Task 102");

        tasks.deleteTask(102);

        System.out.println("\nAfter Deletion");
        tasks.displayTasks();
    }
}