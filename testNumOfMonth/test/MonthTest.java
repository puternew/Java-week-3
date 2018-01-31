
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testnumofmonth.Month;


public class MonthTest {
    private Month month;
    public MonthTest() {
        month = new Month(); 
    }
    
    @Test
    public void find31DaysOfMonth(){
        int expected =31;
        int actual = month.findDaysOfMonth(1);
        assertEquals(expected,actual);
    }
    @Test
    public void find30DaysOfMonth(){
        int expected =30;
        int actual = month.findDaysOfMonth(9);
        assertEquals(expected,actual);
    }   
        
    @Test
    public void find28DaysOfMonth(){
        int expected =28;
        int actual = month.findDaysOfMonth(2);
        assertEquals(expected,actual);
    }
    @Test
    public void findNameOfMonth(){
        String expected ="JAN";
        String actual = month.findNameOfMonth(1);
        assertEquals(expected,actual);
    
        
    }


}


