/**
 * File name: ShiftThread.java
 * @Author: Aarohan Mishra
 */
package src;
import java.util.Date;
import java.util.Timer;
import java.lang.Thread;
import java.lang.System;

public class ShiftThread extends Thread{
    /**Variable to store the employees Unique Identification Number (UID)*/
    private String empNum;
    private Timer x;
    private Date date;
    private long startTime;
    private long endTime;
    public ShiftThread(String empNum){
        this.empNum= empNum;
        this.date= new Date();
        this.x= new Timer(empNum);
        this.startTime= 0;
        this.endTime= 0;
    }
    @Override
    public void run(){
        if(Thread.currentThread().isAlive()){
            this.endTime= System.currentTimeMillis();

        }
        else{
            this.startTime= System.currentTimeMillis();
        }
    }
}
