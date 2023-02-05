
import java.util.Arrays;
public class BinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {56,89,34,7,0,8};
		int num=7;
		int pos=0;
		for(int i=0;i<arr1.length;i++)
		{ 
			if(arr1[i]==num)
			{
				pos=i;
		    
				break;
				}
			else
				pos=-1;
		}
		
		System.out.println("Array: "+ Arrays.toString(arr1));
		if(pos==-1)
			System.out.println("Number "+num +" is not present in the array");
		else
System.out.print("Number "+num+" is present on the ["+pos+"] index value of the array");
	}

}
