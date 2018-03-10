class Example 
{
     Example(){
		 this(10);
     System.out.println("EX No arg constructer");
	 }
     Example(int a){
		 this("abc");
    System.out.println("EX Int arg constructer");
     }
	  Example(String s){
		  //this(); compile time error recurisive call
    System.out.println("EX String arg constructer");
     }
	 
	public static void main(String[] args) 
	{
	    Example s=new Example();
		Example s1=new Example(10);
		Example s2=new Example("abc");
	}
}
