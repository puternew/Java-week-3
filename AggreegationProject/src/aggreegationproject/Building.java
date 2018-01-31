
package aggreegationproject;


public class Building {
    private String buildingName;
    private Address buildingAddr;
    private Room buildingRooms[];
    
    public Building(String name,Address addr) {
        buildingName = name;
        buildingAddr = addr;
        create();
        
        
        }
    public void create() {
        this.buildingRooms = new Room[100];
        for (int i=0;i<buildingRooms.length;i++){
        buildingRooms[i] = new Room("room# "+(i+1)," "+(i+1),(i+1)*100);
    
        }
  }
}

