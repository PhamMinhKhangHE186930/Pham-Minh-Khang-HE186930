
package DTO;

public abstract class Organiztion {
    protected int size;

    public Organiztion() {
    }

    public Organiztion(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public abstract void communiateByTool();
    
    @Override
    public String toString(){
        return "the organization's size is " + getSize();
    }
}
