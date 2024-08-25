package FB_tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RedisService redisService = new RedisService();
        Scanner scanner = new Scanner(System.in);
        
        

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Set Record");
            System.out.println("2. Get Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Exit");
            

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
            
            // set
                case 1:
                    System.out.println("Enter key: ");
                    String key = scanner.nextLine();
                    System.out.println("Enter value: ");
                    String value = scanner.nextLine();
                    redisService.setRecord(key, value);
                    System.out.println("Record set successfully.");
                    break;

                    
                    // set
                case 2:
                    System.out.println("Enter key: ");
                    key = scanner.nextLine();
                    String retrievedValue = redisService.getRecord(key);
                    System.out.println("Retrieved value: " + retrievedValue);
                    break;

                    
                    // del
                case 3:
                    System.out.println("Enter key: ");
                    key = scanner.nextLine();
                    redisService.deleteRecord(key);
                    System.out.println("Record deleted successfully.");
                    break;

                    // exit
                case 4:
                    redisService.close();
                    System.out.println("Exiting...");
                    return;

                    // invalid
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
