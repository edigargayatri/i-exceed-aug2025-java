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
class threaddemo3{
    public static void main(String[] args) throws InterruptedException
     {
        
        sample obj = new sample();
        obj.start(); // Start the thread
        for(int i=0;i<5 ;i++){
            System.out.println("Main thread: " + i);
            Thread.currentThread().sleep(500); // Sleep for 0.5 seconds
        }
    }
}