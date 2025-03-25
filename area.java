import java.util.Scanner;
class area{
    double area;

    void area( double r){
        area= 3.142*r*r;
    }
     void area( double l , double b){
        area= 3.142*l*b;
     }
      void area(double b,int h){
        area=0.5*b*h;
      }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter radius :");
        double radius=s1.nextDouble();
        area a1=new area();
        a1.area(radius);
        System.err.println("enter lenght-9**");


    }
}