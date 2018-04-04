
package friend;


public class School extends Friend{
    private String major;

    public School(String major) {
        this.major = major;
    }

    public School(String major, String name, int num) {
        super(name, num);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "School{" + "major=" + major + '}';
    }
    
    
    
    
}
