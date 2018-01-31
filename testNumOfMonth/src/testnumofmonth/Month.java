
package testnumofmonth;

import java.util.Scanner;


public class Month {
    private String monthName[];

    public Month() {
        monthName = new String[]{"JAN","FEB","MAR","APL","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
    }

    public Month(String[] monthName) {
        this.monthName = monthName;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input your number of the month : ");
        int numMonth = sc.nextInt();
        Month m1= new Month();
        
        int number =  findDaysOfMonth(numMonth);
        
        System.out.println(">> Is month "+m1.findNameOfMonth(numMonth)+" have "+number+" DAY");
       
    }
    public static int findDaysOfMonth(int monthNumber){
       int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    return monthNumber > 0 && monthNumber < 13?month [monthNumber-1] : -1;
    }

    public String findNameOfMonth(int monthNumber){
       return monthNumber >= 1 && monthNumber < 13?monthName[monthNumber-1] : "Not have month";
    }
    
    public String[] reverseNameOfMonth(){
          String[] reverseNameOfMonth = new String[monthName.length];
          for(int i=1;i<monthName.length+1;i++){
          reverseNameOfMonth[i-1] = this.monthName[monthName.length-1];
          
          }
          return reverseNameOfMonth;
    }
}
