//interface supports static

interface one{
    static void display(){
        System.out.println("static used in interface");
    }
    public void methodone();
}
class example implements one{
    example(){

    }
    @Override
    public void methodone(){

        System.out.println("inside example implemented from one");
    }
}
class interfacedemo2{
    public static void main(String[] args) {
        example ex =new example();
        ex.methodone();
        one.display();  /*static not inherited by implementing classes.
                            must call them using the interface name, like one.display()*/


    }
}