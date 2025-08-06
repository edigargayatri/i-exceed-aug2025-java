// diamond problem -- interfacename.super.methodname
// interfaces support default

interface one{
        public void methodone();
        default void display()
	{
	   System.out.println("Default method from interface1");
	}
}
interface two
{
        public void methodtwo();
        default void display()
	{
	   System.out.println("Default method from interface2");
	}
}
class example implements one,two{
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
      public void display(){
           one.super.display();
           two.super.display();
      }

}

class interfacedemo{
    public static void main(String[] args) {
       
        example ex= new example();
        ex.methodone();
        ex.methodtwo();

        ex.display();
        
        
    }
}