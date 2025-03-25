class  EXAMPLE extends Thread{
    public void run(){
        System.out.println("task..");
    }}
    public class Multithread{
         public static void main (String[] args){
            EXAMPLE t1= new EXAMPLE ();
             EXAMPLE t2= new EXAMPLE ();
            t1.start ();
            t2.start ();
        }
    }
    