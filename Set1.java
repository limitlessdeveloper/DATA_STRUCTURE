class Set1{
	static int x;
	public static void main(String args[]){
		System.out.println(fun());
		
	}
	
	static int fun(){
	//	static int x=20;    		//error:static local variable are not allowed in java.
		x=10;
		return ++x;
	}
}