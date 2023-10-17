
import java.util.List;


public class ItemList {
    private Item [] list;
    private int numOfitem;
    private final int MAX=100;

    public ItemList() {
        list = new Item[MAX];
        numOfitem = 0;
    }
    public boolean addItem(Item item){
        if(item==null||numOfitem>=MAX){
            return false;
        }
        list[numOfitem]=item;
        numOfitem++;
        return true;
    }
    public void displayAll(){
        if(numOfitem==0){
            System.out.println("the list is empty");
        }
        for (int i = 0; i < numOfitem; i++) {
            System.out.println(list[i]);
        }
    }
    public Item findItem(String creator){
        for (int i = 0; i < numOfitem; i++) {
            if(list[i].getCreator().equals(creator)){
                return list[i];
            }
        }
        return null;
    }
    public int findItemIndex(String creator){
        for(int i=0; i< numOfitem; i++){
            if( list[i].getCreator().equals(creator))
                return i;
        }
        return -1;
    }
    public boolean updateItem(int index){
        if( index >= 0 && index < numOfitem){
            list[index].input();
            return true;
        }
    return false;
    }
    public boolean removeItem(int index){
        if( index >= 0 && index < numOfitem){
            for(int j=index; j< numOfitem; j++ ){
                list[j]=list[j+1];
            }
            numOfitem --;
            return true;
        }
        return false;
    }
    public void displayItemsByType(String type){
        if (type.equals("Vase")){
            for(int i=0; i < numOfitem; i++)
                if ( list[i] instanceof Vase) System.out.println( list[i]);
        }
        else if (type.equals("Statue")){
            for(int i=0; i < numOfitem; i++)
                if ( list[i] instanceof Statue) System.out.println( list[i]);
        }
        else {
            for(int i=0; i < numOfitem; i++)
                if ( list[i] instanceof Painting) System.out.println( list[i]);

        }
    }
    public void sortItems(){
        for(int i=0; i< numOfitem; i++){
            for(int j=numOfitem-1; j>i ;j--){
                if( list[i].getValue()< list[j-1].getValue()){
                    Item tmp=list[j];
                    list[j]=list[j-1];
                    list[j-1]=tmp;
                }
            }
        }
    }
}
