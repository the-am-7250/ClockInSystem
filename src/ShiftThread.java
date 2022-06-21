package src;
import java.util.Date;
import java.util.Timer;

public class ShiftThread extends Thread{
    private String empNum;
    private Timer x;
    private Date date;
    public ShiftThread(String empNum){
        this.empNum= empNum;
        this.date= new Date();
        this.x= new Timer(empNum);
    }
    @Override
    public void run(){
        if(this.isAlive()){
            //
        }
        else{
            //x.schedule();
        }
    }
}
