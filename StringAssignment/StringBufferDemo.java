class StringBufferDemo{
	
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb.toString());
		
		//append
		System.out.println(sb.append(" World"));
		
		//insert
		System.out.println(sb.insert(6 ,"Java "));
		
		// replace
		System.out.println(sb.replace (6,10,"java"));
		
		// delete
		System.out.println(sb.delete(6,13));
		
		//reverse
		System.out.println(sb.reverse());
	}
}
