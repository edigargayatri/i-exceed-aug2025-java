class threaddemo4optimised{
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                for(var i=0;i<5;i++){
                    System.out.println(i);
                }
            }
        }.start();
    }
}