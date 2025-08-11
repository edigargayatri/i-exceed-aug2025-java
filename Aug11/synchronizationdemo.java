class call{
     synchronized public void callme(String msg){
        System.out.print(" [");
         System.out.print(msg);
          System.out.print("]");
          display();
    }
    public void display(){
        for(var i=0;i<5 ;i++){
            System.out.print(i);
        }
    }
}
class caller extends Thread{
    call target;
    String msg;
    Thread t= new Thread(this);
    caller(call targ, String m) {
        target = targ;
        msg = m;
        t.start(); // Start the thread
    }
    
    public void run() {
        target.callme(msg);
    }
}

class synchronizationdemo{
    public static void main(String[] args) {
        call obj = new call();
        caller p1 = new caller(obj, "hi");

        caller p2 = new caller(obj, " I am");
        caller p3 = new caller(obj, "Gayatri");

       
    }
}