package com.collection;

public class CopyOnWrite {

	public static void main(String[] args) {
		 try {
	            int result = 2/0;
	            System.out.println(result);
	        }catch(Exception e){
	        	System.out.println("++++++++++++");
	        }/*catch(ArithmeticException e){
	        	System.out.println("++++++++++++");
	        }*/ 
		 finally{
	        	System.out.println("------------");
	        }
	        System.out.println("Division attempt done");
		


	}

}
