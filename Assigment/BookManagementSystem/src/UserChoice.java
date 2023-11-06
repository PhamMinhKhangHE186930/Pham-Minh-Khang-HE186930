
import java.util.Scanner;


public class UserChoice {
    public static Scanner sc = new Scanner(System.in);
    public static void getChoice(){
        String fname;
        int choice;
        BookList bl = new BookList();
        do{
            System.out.println();
            System.out.println(" 1. Input & add book(s) to the end.");
            System.out.println(" 2. Display all books.");
            System.out.println(" 3. Search a book for given code.");
            System.out.println(" 4. Update the book's price for given code.");
            System.out.println(" 5. Find the (first) max price value.");
            System.out.println(" 6. Sort the list ascendingly by code.");
            System.out.println(" 7. Remove the book having given code.");
            System.out.println(" 8. Load data from file.");
            System.out.println(" 0. Exit ");
            System.out.print("    Your selection (0 -> 8): ");
            choice = sc.nextInt(); sc.nextLine();
            switch(choice){
                case 0:
                    break;
                case 1:
                    bl.inputBook();
                    break;
                case 2:
                    bl.DisplayAll();
                    break;
                case 3:
                    bl.SearchBookCode();
                    break;
                case 4:
                    bl.UpdatePrice();
                    break;
                case 5:
                    bl.FindMaxPrice();
                    break;
                case 6:
                    bl.SortAscCode();
                    break;
                case 7:
                    bl.RemoveCode();
                    break;
                case 8:
                    System.out.print("Enter file name (b = book.txt): ");
                    fname = sc.nextLine();
                    if(fname.trim().equalsIgnoreCase("b")) fname = "book.txt";
                    bl.LoadFromFile(fname);
                    break;
            }
        }while(choice>0 && choice<9);  
    }
}
