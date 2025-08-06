
// default method with body can be used in interfaces
interface one{
        
        public void methodone();
        default void displayone()
        {
        System.out.println("default method with body");
        }
}
interface two extends one
{
        public void methodtwo();
}
class example implements two{
      example(){
         
      }
      @Override
      public void methodone(){
        System.out.println("from one");
      }
      @Override
      public void methodtwo(){
        System.out.println("from two");
      }

}

class interface_java8{
    public static void main(String[] args) {
       
        example ex= new example();
        ex.methodone();
        ex.methodtwo();
        ex.displayone();
        
    }
}