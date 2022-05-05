import java.util.Scanner;

class stack
{
	int top= -1;
	int n = 10;
	int a[] = new int [n];
	
	Scanner sc= new Scanner(System.in);
	
	void push()
	{
		if(top == n-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			System.out.println("Enter the Value");
			int i= sc.nextInt();
			top= top + 1;
			a[top]= i;
		}
	}
	
	void pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow");
		}
		else
		{
			System.out.println("Enter the Value");
			top= top-1;
		}
		
	}
	
	void display()
	{
		System.out.println("Item Inserted");
		for (int j=top; j>=0; j--)
		{
			System.out.println(a[j]);
		}
	}
}


class stack_array
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		stack s= new stack();
		
		int l;
		
		do
		{
			System.out.println("press 1 to push");
			System.out.println("press 2 to pop");
			System.out.println("press 3 to display");
			int d= sc.nextInt();
			
			switch(d)
			{
				case 1:
				{
					s.push();
					break;
				}
				case 2:
				{
					s.pop();
					break;
				}
				case 3:
				{
					s.display();
					break;
				}
				
			}
			System.out.println("enter 0 to go back");
			System.out.println("enter any key to exit");
			
			l= sc.nextInt();
		}
		while(l==0);
	}
}