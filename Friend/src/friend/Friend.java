
package friend;

public class Friend {

    private String name;
    private int num;

    public Friend() {
    }

    public Friend(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Friend{" + "name=" + name + ", num=" + num + '}';
    }
    
    
    
}
