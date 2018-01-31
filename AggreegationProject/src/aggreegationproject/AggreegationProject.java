
package aggreegationproject;

public class AggreegationProject {

    public static void main(String[] args) {
        Address adamAddr = new Address("888","Putabucha","BKK","101");
        Student adam = new Student (601305l,"Adam",adamAddr);
        System.out.println(adam);
        //gabase
        adam = null;
        
        Student pun = new Student(6013052,"PUN",adamAddr);
        System.out.println(pun);
        
        Address punAddr = new Address("111","Rachada","BKK","10000");
        punAddr.setHouseNo("123456789");
        pun.setStdAddr(punAddr);
        System.out.println(pun);
    }
    
}
