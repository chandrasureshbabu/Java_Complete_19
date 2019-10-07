package Arrays;

public class TwodimensionalArray {

	public static void main(String[] args) {
		int rows=3;
		int cols=3;
		
		int[][] table= new int[rows][cols];
		
		table[0][0]=11;
		table[0][1]=22;
		table[0][2]=33;
		
		table[1][0]=41;
		table[1][1]=51;
		table[1][2]=61;
		
		table[2][0]=72;
		table[2][1]=82;
		table[2][2]=92;
		
		System.out.println(table.length);//rows length
		System.out.println(table[0].length);//columns length
		
		// printing array in rectangular way
		for(int i=0;i<table.length;i++)
		{
			for(int j=0; j<table[0].length;j++)
			{
				System.out.print(" "+table[i][j]);
			}
			System.out.println(" ");
		}

	}

}
