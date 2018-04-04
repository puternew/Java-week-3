package week5;

public class Week5 {

    public static void main(String[] args) {
        /* Circle c1;
        Circle2 n1;
        Circle2 c2 = new Circle2(2.5,1);
        double area =  c2.findArea();
        double circum = c2.finCircumherence();
        System.out.println("Area = "+area);
        System.out.println("Circum = "+circum);
        System.out.println(c2);
    }*/
 /*Square2 s2 = new Square2(2);
        System.out.println("Area = "+s2.findArea());
        System.out.println("Circum = "+s2.findCircumference());
        System.out.println(s2);*/
       /* String str1 = "Book";
        String str2 = "ant";
        System.out.println(str1.compareTo(str2));
*/
Rectangle rec1 = new Rectangle(5,10);
Rectangle rec2 = new Rectangle(2,4);
        System.out.println(rec1.compareTo(rec2));
        int result = rec1.compareTo(rec2);
        if(result>0){
            System.out.println("rec2 come before rec1");
        }
          else  if(result<0){
            System.out.println("rec1 come before rec2");
    }
        else
              System.out.println("rec1 = rec2");
    }
}
