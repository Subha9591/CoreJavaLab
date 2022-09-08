/** Programme: Simple interest
@author: Subha Mondal
@Date : 8 September 2022
*/

// Declaring class 
class Interest
{
	public static void main(String args[])     //declaring main
	{
		int time =5;
		// input
		float principal_Value= Float.parseFloat(args[0]);
		float interest=Float.parseFloat(args[1]);
		
		//calculating interest
		float simple_interset = (principal_Value* interest*time)/100;
		
		//printing the value 
		System.out.println("Simple Interest is: "+simple_interset);


	} // End of the main
	


} // End of class 