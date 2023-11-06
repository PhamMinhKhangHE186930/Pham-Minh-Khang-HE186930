
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class BookList extends Book{
    ArrayList<Book> wList;

    public BookList() {
        wList = new ArrayList<>();
    }
    private static Scanner sc = new Scanner(System.in);
    
    public void inputBook(){
        String code, title;
        int quantity;
        double price;
        code = checkException.getString("Enter code: ", wList, 1);
        System.out.print("Enter title: ");
        title = sc.nextLine();
        quantity = checkException.getInt("Enter quantity: ", 0);
        price = checkException.getDouble("Enter price: ", 0.000001);
        
        wList.add(new Book(code, title, quantity, price));
    }
    public void DisplayAll(){
        if(wList.isEmpty()){
            System.out.println("List is empty");
        }else{
            for (Book book : wList) {
                System.out.println(book);
            }
        }
    }
    public void SearchBookCode(){
        String code  = checkException.getCode("Enter Book's Code: ", wList);
        Book o = checkException.getBook(code, wList);
        System.out.println(o);
    }
    public void UpdatePrice(){
        String code  = checkException.getCode("Enter Book's Code: ", wList);
        Book o = checkException.getBook(code, wList);
        double update = checkException.getDouble("Enter new price: ", 0.000001);
        o.setPrice(update);
        System.out.println(o);
    }
    public void FindMaxPrice(){
        if(wList.isEmpty()){
            System.out.println("List is empty.");
        }else{
            double max = 0.0;
            Book o = wList.get(0);
            for (Book book : wList) {
                if(max<book.getPrice()){
                    max = book.getPrice();
                    o = book;
                }
            }
            System.out.println(o);
        }
    }
    public void SortAscCode(){
        Collections.sort(wList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getCode().compareTo(o2.getCode());
            }
        });
        DisplayAll();
    }
    public void RemoveCode(){
        String code = checkException.getCode("Enter code to remove: ", wList);
        Book b = checkException.getBook(code, wList);
        wList.remove(b);
    }
    public void LoadFromFile(String fname){
        File f = new File(fname);
        try{
            FileWriter fw = new FileWriter(fname);
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(wList.toString());
            bf.close();
        }catch(IOException e){
            System.out.println(e);
        }
        try{
            Scanner rd = new Scanner(f);
//            sc.useDelimiter("[[.]\\d]+");
            while(rd.hasNextLine()){
                String data = rd.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
