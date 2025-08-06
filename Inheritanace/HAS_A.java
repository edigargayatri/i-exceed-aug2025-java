class student{
    String name;
  
     HAS_A_Address address;

    student( String name,  HAS_A_Address address){
           
            this.name=name;
      
            this.address=address;
    }
    public void display(){
            System.out.println("name "+name);
            address.displayAddress();
    }
}
class  HAS_A{
      public static void main(String[] args) {
           HAS_A_Address obj1 = new  HAS_A_Address("main road","yelahanka");
           student stu=new student("Gayatri" ,obj1);
           stu.display();
      }
}