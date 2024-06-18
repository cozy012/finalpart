
package finalpart;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<String> developers;
    private ArrayList<String> taskNames;
    private ArrayList<String> taskIDs;
    private ArrayList<Integer> taskDurations;
    private ArrayList<String> taskStatuses;
    
    public TaskManager() {
        developers = new ArrayList<>();
        taskNames = new ArrayList<>();
        taskIDs = new ArrayList<>();
        taskDurations = new ArrayList<>();
        taskStatuses = new ArrayList<>();
    }
    public void populateArrays(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of developers:");
        int numDevelopers = scanner.nextInt();
        
        for (int i = 0; i < numDevelopers; i++){
            System.out.println("Enter developer name:");
            String developerName = scanner.next();
            developers.add(developerName); 
        }
        System.out.println("Enter the number of tasks:");
        int numTasks = scanner.nextInt();
        
        for (int i = 0; i < numTasks; i++) {
              System.out.println("Enter task name:");
            String taskName = scanner.next();
            taskNames.add(taskName);

            System.out.println("Enter task ID:");
            String taskID = scanner.next();
            taskIDs.add(taskID);

            System.out.println("Enter task duration:");
            int taskDuration = scanner.nextInt();
            taskDurations.add(taskDuration);

            System.out.println("Enter task status:");
            String taskStatus = scanner.next();
            taskStatuses.add(taskStatus);
         }
    }
    
     public void displayDoneTasks(){
         for (int i = 0; i < taskStatuses.size(); i++) {
             if (taskStatuses.get(i).equals("done")) {
                System.out.println("Developer: " + developers.get(i));
                System.out.println("Task Name: " + taskNames.get(i));
                System.out.println("Task Duration: " + taskDurations.get(i));
                System.out.println("-----------------------------");
         }
     }
   }
     public void displayLongestTask(){
          int maxDuration = 0;
        int maxDurationIndex = -1;
        
        for (int i = 0; i < taskDurations.size(); i++){
            if (taskDurations.get(i) > maxDuration) {
                maxDuration = taskDurations.get(i);
                maxDurationIndex = i;
        }
     }
        System.out.println("Developer: " + developers.get(maxDurationIndex));
        System.out.println("Task Name: " + taskNames.get(maxDurationIndex));
        System.out.println("Task Duration: " + taskDurations.get(maxDurationIndex));
        System.out.println("-----------------------------");
    }
     
     public void searchTaskByName(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name to search:");
        String searchTaskName = scanner.next();
        
        for (int i = 0; i < taskNames.size(); i++){
            if (taskNames.get(i).equals(searchTaskName)) {
                System.out.println("Task Name: " + taskNames.get(i));
                System.out.println("Developer: " + developers.get(i));
                System.out.println("Task Status: " + taskStatuses.get(i));
                System.out.println("-----------------------------");
                return;
        }
     }
        System.out.println("Task not found.");
    }
     public void searchTasksByDeveloper(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter developer name to search:");
        String searchDeveloper = scanner.next();
        
         for (int i = 0; i < developers.size(); i++){
             if (developers.get(i).equals(searchDeveloper)) {
                System.out.println("Task Name: " + taskNames.get(i));
                System.out.println("Task Status: " + taskStatuses.get(i));
                System.out.println("-----------------------------");
         }
     }
    }
        public void deleteTask() {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name to delete:");
        String deleteTaskName = scanner.next();
        
        for (int i = 0; i < taskNames.size(); i++){
            if (taskNames.get(i).equals(deleteTaskName)){
                taskNames.remove(i);
                taskIDs.remove(i);
                taskDurations.remove(i);
                taskStatuses.remove(i);
                System.out.println("Task deleted.");
                return;
            }
        }
        System.out.println("Task not found.");
        }
        public void displayReport(){
            for (int i = 0; i < taskNames.size(); i++) {
            System.out.println("Developer: " + developers.get(i));
            System.out.println("Task Name: " + taskNames.get(i));
            System.out.println("Task ID: " + taskIDs.get(i));
            System.out.println("Task Duration: " + taskDurations.get(i));
            System.out.println("Task Status: " + taskStatuses.get(i));
            System.out.println("-----------------------------");
        }
    }
}
