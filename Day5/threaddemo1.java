class sample extends Thread {
    Thread t= new Thread(this);
      public void run()
	{  t.setName("My Thread");
	   System.out.println(t.getName() + " is running");
	}
}
class threaddemo1{
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        sample obj = new sample();
        obj.start(); // Start the thread
    }
}