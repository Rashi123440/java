interface I1{ 
int add (int a,int b);
int sub(int a ,int b);
}
interface I2{ 
int multiply (int a,int b);
double divide(int a ,double b);
}
class Multipleinheritance   implements I1,I2{
    public int add(int a, int b){
        int d= a+b;
        return d;
    }
      public int sub(int a, int b){
        int c= a-b;
        return c;
    }

  public int multiply(int a, int b){
        int m= a*b;
        return m;
    }
 // public divide(int a, int b){
      //  int r= a/b;
       // return r;
  //  }
    public static void main (String[] args){
    Multipleinheritance s= new  Multipleinheritance ();
   // s.add(10,5);
   // s.sub(10,5);
   // s.multiply(10,5);
    //s.divide(10,5);
    System.out.println("add"+  +s.add(10,5));
    System.out.println("sub" + + s.sub(10,5));
    System.out.println("multiply"+" "+s.multiply(10,5));
    System.out.println("divide"+  s.divide(10,5));

    }
    
}

