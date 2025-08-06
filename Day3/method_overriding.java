
class example{

    example() {
    }
    public void display()
    {
       System.out.println("display in super class");
    }
}
class example1 extends example{

     example1() {
    }
    public void display(){
        System.out.println("display in derived class");
    }
}
class method_overriding{
    public static void main(String[] args) {
        example ref;
        example ex= new example();
        example1 ex1 = new example1();
        ref=ex1;
        ref.display();    // dynamic method dispatch -runtime polymorphism
        ex.display();
      
    }
}