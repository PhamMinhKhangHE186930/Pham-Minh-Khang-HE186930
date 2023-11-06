
import java.util.ArrayList;
import java.util.Scanner;


public class checkException {
    private static Scanner sc = new Scanner(System.in);
    public static int getInt(String msg, int min){
        int n;
        while(true){
            try{
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if(min<= n) break;
            }catch(NumberFormatException e){
                System.out.println("You need input quantity by an integer > 0. Please enter again.");
            }
        }
        return n;
    }
    public static double getDouble(String msg, double min){
        double d;
        while(true){
            try{
                System.out.print(msg);
                d = Double.parseDouble(sc.nextLine());
                if(min<= d) break;
            }catch(NumberFormatException e){
                System.out.println("You need input price > 0. Please enter again.");
            }
        }
        return d;
    }
    // kiểm tra dữ liệu có trùng lặp hay không
    public static String getString(String msg, ArrayList<Book> wList, int i){
        String t;
        while(true){
            System.out.print(msg);
            t = sc.nextLine();
            if(!t.isEmpty()){
                if(getBook(t, wList)==null){
                    break;
                }
            }
            System.out.println("Code cannot duplicate or null.");
        }
        return t;
    }
    // kiểm tra dữ liệu có tồn tại hay không
    public static String getCode(String msg, ArrayList<Book> wList){
        String s;
        while(true){
            System.out.print(msg);
            s = sc.nextLine();
            if(!s.isEmpty()){
                if(getBook(s, wList)!=null) break;
            }
            System.out.println("Cannot find the code.");
        }
        return s;
    }
    public static Book getBook(String id, ArrayList<Book> wList){
        for (Book book : wList) {
            if(book.getCode().equals(id)) return book;
        }
        return null;
    }
}
