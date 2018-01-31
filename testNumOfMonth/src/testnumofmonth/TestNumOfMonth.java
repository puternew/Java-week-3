
package testnumofmonth;

import java.util.Scanner;


public class TestNumOfMonth {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("INPUT :"); 
    int month = sc.nextInt();
    System.out.println(numOfMonth(month));  
    }
        
    public static int numOfMonth(int month){
    int answer=0;
    if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
    answer =31;
    } else if(month==4||month==6||month==9||month==11){
    answer =30;
    } else if(month==2){
        answer=28;}
    return answer;
    }
    
}
