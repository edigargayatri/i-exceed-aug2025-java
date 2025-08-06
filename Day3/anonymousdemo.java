abstract class sample1{
	abstract public void display();
}
class anonymousdemo{
	public static void main (String args[]){
	sample1 obj= new sample1()
	{
		@Override
		public void display(){
			System.out.println("Anonymous class");
		}
		
	};
	obj.display();
	}
}