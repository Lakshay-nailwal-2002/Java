package arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Challange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();
        while(true){
            printInputString();
            int input = sc.nextInt();
            sc.nextLine();
            if(input == 0){
                System.out.println("-".repeat(20));
                System.out.println("Shutting down system...");
                break;
            }
            else if (input == 1){
                System.out.println("Now Enter items to add: \n");
                var inputArr = sc.nextLine().split(",");
                for(String itemName : inputArr){
                    if(groceryList.contains(itemName.toUpperCase().trim())) continue;
                    groceryList.add(itemName.toUpperCase().trim());
                }
            }
            else {
                System.out.println("Now Enter items to remove: \n");
                var inputArr = sc.nextLine().split(",");
                for(String itemName : inputArr){
                    groceryList.remove(itemName.toUpperCase().trim());
                }
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println("Current List Items : " + groceryList );
        }
    }

    public static void printInputString(){
        String sb = """
                Available actions: \s
                
                0 - To shutdown\s
                1 - To add item(s) to list\s
                2 - To remove any item(s) from list\s
                """;
        System.out.println(sb);
    }
}

