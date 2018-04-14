
package FactoryP;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MakeAWatch  implements Runnable{

    @Override
    public void run() {
        while (true) {            
            printcurrentrime();
            sleepOneSecond();
        }
        
    }
    
    
    private void sleepOneSecond(){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void printcurrentrime(){
        DateTimeFormatter d = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String formetCurrentTime = LocalDateTime.now().format(d);
        System.out.println(formetCurrentTime);
    }
    
    public static void main(String[] args) {
        Thread t = new Thread(new MakeAWatch());
        t.start();
       // System.out.println("Yeess");
    }
    
}
