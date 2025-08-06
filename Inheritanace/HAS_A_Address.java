class HAS_A_Address
 {
    
    String street,city;
 
       HAS_A_Address(String street,String city)
        {
           
            this.street=street;
            this.city=city;
        }
     public void displayAddress()
     {
        
        System.out.println("Street "+street);
        System.out.println("City "+city);
       
     }
 }