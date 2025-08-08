class sample extends Thread {
    sample(){
         new Thread(this).start();
    }
      public void run()
	{
	   System.out.println("Inside the run method");
	}
}
class threaddemo{
    public static void main(String[] args) {
        sample obj = new sample();
        // obj.display();
    }
}