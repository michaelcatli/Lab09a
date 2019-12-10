// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.


import java.util.Scanner;


public class Lab09avst
{
	private static int num, den;   // numerator and denominator of the rational number

	public static void main (String[] args)
	{
		enterData();
		Rational r = new Rational(num,den);
		r.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		den = input.nextInt();
	}
}



class Rational
{
	int reducedNum, reducedDen, firstNum, firstDen, gcf;
	public Rational(int numer, int denom){
		firstNum=numer;
		firstDen=denom;
		reduce();
		reducedNum=firstNum/gcf;
		redcuedDen=firstDen/gcf;
	}
	public int getNum(){return firstNum;}
	public int getDen(){return firstDen;}
	public double getDecimal()
	{
		double quotient = (double)getNum()/getDen();
		return quotient;
	}

	public void displayData()
	{
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println("and reduces to " + getReduced());
	}

	private void getGCF(int n1,int n2)
	{
		int rem = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
	}
	private void reduce(){
		getGCF(firstNum, firstDen);
	}
	public String getReduced(){
		reduce();
		String redfrac = "" + reducedNum + "/" + reducedDen;
		return redfrac;
	}
	public String getOriginal(){
		String fraction = "" + getNum() + "/" + getDen();
		return fraction;
	}
}
