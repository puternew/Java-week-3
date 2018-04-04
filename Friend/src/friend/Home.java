
package friend;


public class Home extends Friend{
    private String activity;

    public Home(String activity) {
        this.activity = activity;
    }

    public Home(String activity, String name, int num) {
        super(name, num);
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Home{" + "activity=" + activity + '}';
    }

    
    
    
    
}
