class Stringdemo{
    public static void main(String[] args) {
        String str1= "Hello";
        String str2= "World";

        // Concatenating two strings
		String result1= str1 + " "+str2;
		System.out.println(result1);
		
		// Length
		System.out.println(result1.length());
		
		// character at index
		System.out.println(result1.charAt(3));
		
		//indexof
		System.out.println(result1.indexOf("W"));
		
		// substring
		System.out.println(result1.substring(0,4));
		
		// replace
		System.out.println(result1.replace("Hello", "Java"));
		
		// comparison
		System.out.println(result1.equals("Hello World"));
		System.out.println("compare ignoring case: " +result1.equalsIgnoreCase("hello world"));
		
		//search
		System.out.println(result1.contains("Java"));
		 
		//lowercase
		System.out.println(result1.toLowerCase());
		
		//uppercase
		System.out.println(result1.toUpperCase());
		
		//split
		String[] s= result1.split(" ");
		System.out.println(s[0]);
		
		//trim
		String t = "  Java  ";
		System.out.println(t.trim());
        
    }
}