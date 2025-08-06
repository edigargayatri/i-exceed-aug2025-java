
abstract class sample{
    public void display(){
         System.out.println("normal method");
    }
    abstract public void display2(); // every abstract class methods should be overidden
     abstract public void display3(int x,int y);
}
class example extends sample{
    
    @Override
    public void display2(){
         System.out.println("Abstraction");
    }
    @Override
    public void display3(int x,int y){
         System.out.println(x*y);
    }
}
class abstraction {
    public static void main(String[] args) {
        example amp = new example();
        amp.display2(); 
        amp.display3(5, 4);
    }
}
