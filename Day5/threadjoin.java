class sample extends Thread {
    
      public void run()
	{  for(int i=0;i<5 ;i++){
        try{
        System.out.println(i);
        new Thread(this).sleep(1000); // Sleep for 1 second
        }catch(InterruptedException e){}
    }
	}
}
class threadjoin{
    public static void main(String[] args) throws InterruptedException
     {
        
        sample obj = new sample();
        sample obj1 = new sample();
        sample obj2 = new sample();
        obj.start(); // Start the thread
        obj.join(); // Wait for the thread to finish

        obj1.start(); // Start the second thread
        obj2.start(); // Start the third thread


    }
}