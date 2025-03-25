// multilevel  inheritance ..
class Animal{
    public void eat()
    {
        System.out.println("eating...");
    }
}
    class Dog extends Animal{
        public void bark()
        {
            System.out.println("barking...");
        }
    }
    class cat extends Dog{
        public void cry()
         {
            System.out.println("crying...");
            
        }
    }
   class bat extends cat{
    public void laugh()
    {
        System.out.println("laughing...");
    }
   }
   class Minheritance{
    public static void main(String[] args) {
       bat s1=new bat();
        s1.laugh();
       s1. eat();
        s1.bark();
       s1. cry();
        

        
    }
   }
