/*Q1: Sorting
Assume you are given the array a1=[1,2,4,5,3] indexed 0…4. Store the value of a1[4]. Now test lower index values successively from 3 to 0 until you reach a value that is lower than a1[4] , at a1[1] in this case. Each time your test fails, copy the value at the lower index to the current index and print your array. When the next lower indexed value is smaller than a1[4], insert the stored value at the current index and print the entire array.
Example
n=5
a1 = [1,2,4,5,3]
Start at the rightmost index. Store the value of a1[4]=3 . Compare this to each element to the left until a smaller value is reached. Here are the results as described:
1 2 4 5 5
1 2 4 4 5
1 2 3 4 5
*/

import java.util.Scanner;

class InsertionSort
{
	public static void main(String...args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements do you to Sort");
		int n=sc.nextInt();
		int [] a1= new int[n];
		
		System.out.println("Enter Elements   --> ");
		
		for (int i=0; i<n; i++)
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println("==================");
		
		
		//Insertion Sort
		for(int i=1; i<=n-1; i++)
		{
			int temp=a1[i];
			int j=i-1;
			while(temp <= a1[j] && j>0)
			{
				a1[j+1] = a1[j];
				j= j-1;  // After comparing with previous value it will go to other previous elements 
			}
			a1[j+1] = temp;
		}
		
		//Print the Sorted Elements
		for(int i=0; i<n; i++)
		{
			System.out.print(a1[i] +" ");
		}
	}
}