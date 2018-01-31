
package warmup3;

/**
 *
 * @author INT105
 */
public class WarmUp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double[] number = {1,2,3,4,5};
        System.out.println(sum(number));
    }
    public static double sum(double number[]) {
    //double[] sum = new double [5];   
    
    double sum = number[0]+number[1]+number[2]+number[3]+number[4];
    return sum;
    }
}
