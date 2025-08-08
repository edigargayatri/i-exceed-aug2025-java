class student{
          private String name , dept;
		  private int roll;
		  student(String name , int roll , String dept){
		   this.name = name;
		   this.roll= roll;
		   this.dept = dept;
		   }
		   
		   /*public void setName(String name){
			   this.name=name;
		   }
		   public void setRoll(int roll){
			   this.roll=roll;
		   }
		   public void setDept(String dept){
			   this.dept=dept;
		   
		   }*/ //read-only
		   //getters
		   public String getName(){
			  return  name;
		   }
		   public int getRoll(){
			    return roll;
		   }
		   public String getDept(){
			    return dept;
		   }
		   
} 
class SetternGetter{
	public static void main(String[] args){
		student stu = new student("Gayatri ",218,"CSE");
		
        // Print details using getters
		System.out.println("Name: " + stu.getName());
        System.out.println("Roll: " + stu.getRoll());
        System.out.println("Department: " + stu.getDept());
	}
}