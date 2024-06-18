
package finalpart;
import java.util.Scanner;

public class Finalpart {

    
    public static void main(String[] args) {
       TaskManager taskManager = new TaskManager();
        taskManager.populateArrays();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("1. Display done tasks");
            System.out.println("2. Display longest task");
            System.out.println("3. Search task by name");
            System.out.println("4. Search tasks by developer");
            System.out.println("5. Delete task");
            System.out.println("6. Display report");
            System.out.println("7. Exit");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    taskManager.displayDoneTasks();
                    break;
                case 2:
                    taskManager.displayLongestTask();
                    break;
                case 3:
                    taskManager.searchTaskByName();
                    break;
                case 4:
                    taskManager.searchTasksByDeveloper();
                    break;
                case 5:
                    taskManager.deleteTask();
                    break;
                case 6:
                    taskManager.displayReport();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
