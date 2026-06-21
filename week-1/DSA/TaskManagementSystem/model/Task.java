package model;

public class Task {

    public int taskId;
    public String taskName;
    public String status;

    public Task next;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    public void display() {
        System.out.println("Task ID   : " + taskId);
        System.out.println("Task Name : " + taskName);
        System.out.println("Status    : " + status);
    }
}