
package javademo1;

public class IntPoint2 {
    int x=7;
    int y=3;

    public IntPoint2() {
        output();
        x=100;
        y=1000;
        output();
    }

    
    public IntPoint2(int x, int y) {
        output();
        this.x = x;
        this.y = y;
        output();
    }
    public void output(){
        String S = "[" + x + "," + y + "]";
        System.out.println(S);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
