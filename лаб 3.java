import java.util.Scanner;

public static class Girf320
{
	public static void mailn(String args[])
	{
		var in = new Scanner(System.in);
		
		for(;;)
		{
			System.out.print("Введите номер задания: ");
			n = in.nextInt();
			
			if (n == 32)
				ThirtyTwo(in);
			else if (n == 34)
				ThirtyFour(in);
			else if (n == 36)
				ThirtySix(in);
			else
				System.out.print("Задания под таким номером не существует!!!\n\n");
		}
	}
	public static void ThirtyTwo(Scanner in)
	{
		int n;
		
		System.out.print("Введите кол-во ступенек: ");
		n = in.nextInt();
		
		for(int i = 0; i <= n; i++)
		{
			for(int j = 0; j <= i; j++)
			{				
				System.out.print((j + 1) + " ");
			}
			System.out.print("\n");
		}
	}
	public static void ThirtyFour(Scanner in)
	{
		int n;
		
		for(;;)
		{
			System.out.print("Введите кол-во секунд: ");
			n = in.nextInt();
			if ((n < 1) || (n > 1000000))
				System.out.print("Количество секунд должно попадать в промежуток от 1 до 1 000 000!");
			else
				break;
		}
		
		for (int i = 0; n > 0; i++)
		{
			for(j = i; j > 0; j--)
			{
				System.out.print(i + ", ");
				n--;
			}
		}
		System.out.print("\n\n");
	}
	public static void ThirtySix(Scanner in)
	{
		int n;
		
		String[] flags = new String[4]}{"+___","","|__\\","|    "}
		
		System.out.print("Введите кол-во флагов: ");
		n = in.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				
				flags[1] = "|" + (j + 1) + " /";
				System.out.print(flags[i] * n);
				
			}
		}
	}
}