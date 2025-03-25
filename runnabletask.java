class task implements Runnable{
    public void run(){
        System.out.println(" task by implementing runnable");
    }
    }
    public class runnabletask{
        public static void main(String[] args) {
            task t= new task ();
            Thread t1=new Thread();  
            t1.start();
        }
    
}