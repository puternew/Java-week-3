/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.model;

/**
 *
 * @author INT105
 */
public class Student {
  private long stdId;
  private String stdName;
  // like to aggregated / container class
  //student obj. has an address
  private Address stdAddr;
  public Student(long stdId,String stdName,Address stdAddr){
      this.stdId=stdId;
      this.stdName=stdName;
      this.stdAddr=stdAddr;
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