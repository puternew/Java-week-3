package aggreegationproject;

public class Student {

    private long stdId;
    private String stdName;
    //Create aggregate
    private Address stdAddr;

    public Student() {
    }

    public Student(long stdId, String stdName, Address stdAddr) {
        this.stdId = stdId;
        //ให้ memory address
        this.stdName = stdName;
        this.stdAddr = stdAddr;
    }

    public long getStdId() {
        return stdId;
    }

    public void setStdId(long stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public Address getStdAddr() {
        return stdAddr;
    }

    public void setStdAddr(Address stdAddr) {
        this.stdAddr = stdAddr;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", stdName=" + stdName + ", stdAddr=" + stdAddr + '}';
    }
    
    
}
