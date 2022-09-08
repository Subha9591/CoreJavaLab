/* Programme: Division
@author: Subha Mondal
@Date : 8 September 2022
*/

// starting of class Division
class Division
{
	public static void main(String args[])     //declaring main
	{
		// input
		float divident = Float.parseFloat(args[0]);
		float divisor = Float.parseFloat(args[1]);
		
		//calculating the value
		float quatient =divident/divisor;
		float remain = divident%divisor;
		
		//printing the value 
		System.out.println(" Quatient  is : "+quatient);
		System.out.println("Remainder is : "+remain);


	} // End of the main 
	


} // End of the class
