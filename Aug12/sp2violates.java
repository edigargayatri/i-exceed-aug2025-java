class paymentprocess
 {
  public void processType(String paymentType,double amount)
   {
      if(paymentType=="creditcard")
      {
         System.out.println("Discount for creditcard"+(amount*=.10));
      }
      else if(paymentType=="debitcard")
      {
         System.out.println("Discount for debitcard: "+(amount*=.12));
      }
    }
 }

class sp2violates
 {
   public static void main(String asd[])
      {
         paymentprocess po=new paymentprocess();
         po.processType("debitcard",10000);
       }
 }