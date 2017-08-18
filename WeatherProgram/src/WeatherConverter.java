import java.util.Scanner;

public class WeatherConverter 
{

	public static void main(String[] args) 
	{
		//This program will convert temps from Fahrenheit to centigrade
		Scanner cin = new Scanner(System.in);
		
		System.out.println("ENTER FAHRENHEIT TEMP");
		
		float F = cin.nextFloat();
	
		float C = F - 32;
		C = C * 5/9;
		
		System.out.println(C);
		
		if(F<32)
		{
			System.out.println("(Cold)You didnt need to feel your fingers to type?");
		}
		if(F>90)
		{
			System.out.println("(Hot)OVERHEATING");
		}
	
	}

}