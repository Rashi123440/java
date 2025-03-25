class  EXAMPLE extends Thread{
    public void run(){
        System.out.println("task..");
    }}
    public class singleThread{
        public static void main (String[] args){
            EXAMPLE t1= new EXAMPLE ();
            t1.start ();
        }
    }