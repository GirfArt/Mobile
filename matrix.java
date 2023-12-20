import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    
	    var in = new Scanner(System.in);
		
		int row = 0;
		int colomn = 0;
		
		System.out.print("Введите кол-во строк(i): ");
		row = in.nextInt();
		System.out.print("Введите кол-во столбцов(j): ");
		colomn = in.nextInt();
		
		int arr[][] = new int[row][colomn];
		
		for (int i = 0; i < row; i++)
		{
			for(int j = 0; j < colomn; j++)
			{
				arr[i][j] = (int)(Math.random() * 100);
				if (arr[i][j] > 9)
				    System.out.print(arr[i][j] + " ");
				else
				    System.out.print(arr[i][j] + "  ");
			}
			System.out.print("\n\n");
		}
	}
}