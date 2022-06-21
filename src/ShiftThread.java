package src;
import java.util.Timer;

public class ShiftThread extends Thread{
    private String empNum;
    public ShiftThread(String empNum){
        this.empNum= empNum;
        Timer x= new Timer(empNum);
    }
    @Override
    public void run(){
        if(this.isAlive()){

        }
        else{

        }
    }
}
