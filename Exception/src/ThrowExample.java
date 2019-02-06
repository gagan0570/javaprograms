class ThrowExamle{
	public static void main(String[] args) {
		
		try{
			throw new ArithmeticException("Exception throw");

		}
		catch(ArithmeticException e){
			System.out.println(e.toString());

		}
		finally{
			System.out.println("finally");
		}
	}
}