class car{
	private final engine eng;
      String carname, model;
	  car(String carname , String model){
	    eng = new engine("car");
	   this.carname = carname;
	   this.model =model;
	  }
	  public void display(){
		  System.out.println("Car name " + carname);
		  System.out.println("model " + model);
	  }
	  
}
class engine{
	   String type;
	   engine(String type){
		   this.type = type;
	   }
	   public void displayEngine(){
		   System.out.println("inside engine");
	   }
	}
class compositiondemo{
	public static void main(String[] args){
		car c= new car("ABC","XYZ");
		c.display();
	}
}