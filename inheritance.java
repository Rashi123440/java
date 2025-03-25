interface I1{ 
int add (int a,int b);
int sub(int a ,int b);
}
interface I2{ 
int multiply (int a,int b);
int divide(int a ,int b);
}
class inheritance implements I1,I2{
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
  public divide(int a, int b){
        int d= a/b;
        return p;
    }
    public static void main (string[] args){
    inhereitance s= new  inhereitance();
    s.add(10,5);
    s.sub(10,5);
    s.multiply(10,5);
    s.divide(10,5);
    System.out.println(add+" "+d);
    System.out.println(sub+" "+c)
    System.out.println(multiply+" "+m)
    System.out.println(divide" "+p)

    }
    
}

