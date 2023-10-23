class LengthRecursive{
	public static void main(String args[]){
		String str = "AlishaPawar";
		System.out.println("Length of String : "+length(str));
	}

	static int length(String str){
		if(str.equals(""))
			return 0;
		else
			return length(str.substring(1)) + 1;
	}
}