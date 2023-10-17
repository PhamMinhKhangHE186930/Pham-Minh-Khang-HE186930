import java.util.Scanner;

public class ManageProgram {
    public static void main(String[] args) {
        String filename = "employees.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("Add new employee");
        menu.add("Remove an employee");
        menu.add("Promoting the emplyee's salary");
        menu.add("Print the list");
        menu.add("Save to files");
        menu.add("Quit");
        int userChoice;
        boolean changed = false;
        EmpList list = new EmpList();
        list.AddFromFile(filename); // load initial data
        do{
            System.out.println("\nEMPLOYEE MANAGER");
            userChoice = menu.getUserChoice();
            switch(userChoice){
                case 1:
                    list.addNewEmp();
                    changed = true;
                    break;
                case 2:
                    list.removeEmp();
                    changed = true;
                    break;
                case 3:
                    list.promote();
                    changed = true;
                    break;
                case 4:
                    list.print();
                    break;
                case 5:
                    list.saveToFile(filename);
                    changed = false;
                default:
                    if(changed){
                        System.out.print("Save changes Y/N? ");
                        String response = sc.nextLine().toUpperCase();
                        if(response.startsWith("Y")){
                            list.saveToFile(filename);
                        }
                    }
            }
        }while(userChoice>0&&userChoice<6);
    }
}
