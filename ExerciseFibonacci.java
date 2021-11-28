package week1.day1;

public class ExerciseFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range =8;
		int firstNum = 0;
		int secondNum =1;
		int sum = 0;
		
		//Print first numbers 0 and 1
		System.out.println(firstNum);
		System.out.println(secondNum);
		//range is range -2
		for(int i= 1;i<=range-2; i++)
		{
			//Add firstnum and Second Num
			sum = firstNum + secondNum;
			
			//Replace first num with second Num 1 -> FirstNum
			firstNum = secondNum;
			
			//Replace Second Num to Sum 1 - > Sum
			secondNum = sum;
			System.out.println(sum);
			
		}

	}

}
