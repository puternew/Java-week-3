package arrayproject;

public class PointDistance {

    public static void main(String[] args) {
        Point point1 = new Point(5, 2);
        Point point2 = new Point(2, 5);
        System.out.println(point1.getDistance(4, 3));
        
        System.out.println(point2.getDistanceCalculation(5,2));
        System.out.println(point1.getDistanceCalculation(point2));
    }

}
