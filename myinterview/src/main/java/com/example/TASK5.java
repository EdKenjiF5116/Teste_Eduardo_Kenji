package com.example;

import java.util.HashMap;
import java.util.Map;

public class TASK5 {

    // Simulate a data store (replace with a database for real applications)
    private static final Map<Integer, String> tasks = new HashMap();

    public static String createTask(String task) {
        int id = tasks.size() + 1;
        tasks.put(id, task);
        return "Task created with ID: " + id;
    }

    public static String getTask(int id) {
        String task = tasks.get(id);
        if (task == null) {
            return "Task not found";
        }
        return "Task: " + task;
    }

    public static String updateTask(int id, String newTask) {
        if (!tasks.containsKey(id)) {
            return "Task not found";
        }
        tasks.put(id, newTask);
        return "Task updated";
    }

    public static String deleteTask(int id) {
        if (!tasks.containsKey(id)) {
            return "Task not found";
        }
        tasks.remove(id);
        return "Task deleted";
    }

    public static void main(String[] args) {
        // Example usage
        String taskId1 = createTask("Buy groceries");
        System.out.println(taskId1);

        String task = getTask(1);
        System.out.println(task);

        String updateResult = updateTask(1, "Buy milk and bread");
        System.out.println(updateResult);

        String deleteResult = deleteTask(1);
        System.out.println(deleteResult);
    }
}