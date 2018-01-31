package arrayproject;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    public String getDistance(int x2, int y2) {
        double z = 0;
        z = Math.sqrt((Math.pow(x2 - x, 2)) + Math.pow(y2 - y, 2));
        return "(" + x2 + ", " + y2 + ")DISTANCE(" + x + ", " + y + ") = " + z;
    }
    
    public double getDistanceCalculation(double x2,double y2){
    double distance = 0;
    distance = Math.sqrt((Math.pow(x2 - x, 2)) + Math.pow(y2 - y, 2));
    return distance;
    }
    public double getDistanceCalculation(Point target){
    double distance = 0;
    distance = Math.sqrt((Math.pow(target.getX() - this.getX(), 2)) + 
               Math.pow(target.getY() - this.getY(), 2));
    return distance;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }

}
