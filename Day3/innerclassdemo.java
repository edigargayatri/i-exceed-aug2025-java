class karnataka{

   
    class bangalore {
        void display() {
            System.out.println("This is Bangalore, Karnataka.");
        }
    }
    // public static void main(String[] args) {
    //     karnataka state = new karnataka();
    //     bangalore city = state.new bangalore();
    //     city.display();
    // }

   
}
class innerclassdemo {
    public static void main(String[] args) {
        karnataka.bangalore state = new karnataka().new bangalore();
         /* to access the inner class bangalore of the outer class 
    karnataka through the outer class object
    */ 
       
        state.display();
    }
}
 