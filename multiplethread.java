class  EXAMPLE extends Thread{
    public void run(){
        System.out.println("task 1..");
    }}
    class  test extends Thread{
    public void run(){
        System.out.println("task  2..");
    }}
    public class multiplethread{
        public static void main (String[] args){
            EXAMPLE t1= new EXAMPLE ();
            test t= new test ();
            t1.start ();
            t.start();

        }
    }