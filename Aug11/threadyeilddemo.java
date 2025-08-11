class one extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" Thread one: " + i);
            Thread.yield(); // Suggests that the current thread is willing to yield its current use of the CPU
        }
    }
}
class threadyeilddemo{
    public static void main(String[] args) {
        one obj = new one();
        obj.start(); // Start the thread
        one obj2= new one();
        obj2.start(); // Start the thread
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
            Thread.yield(); // Suggests that the main thread is willing to yield its current use of the CPU
        }
    }
}