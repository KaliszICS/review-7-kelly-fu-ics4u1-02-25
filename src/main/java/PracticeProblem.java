public class PracticeProblem {

	public static void main(String args[]) {

	}


	//Write your functions here
	public static String evenOrOdd(int num){
	if (num % 2 == 0){
		return "Even";
	}
	else {
		return "Odd";
	}
}


	public static String teacherOrStudent(String word){
		if (word.equals("Kalisz") ){
			return "Teacher";
		}

		else{
			return "Student";
		}
	}


	public static int fartherFromZero(int num2){
		if (num2 > 0){
		int num3;
		num3 = num2 + 5;
		return num3;
	}
		else if (num2 < 0){
		int num4;
		num4 = num2 - 5;
		return num4;
		}
		else {
		return 0;
		}
}


	public static String isFive(int num5){
		if (num5 == 5){
			return "The number is Five";
		}
		else{
			return "The number is not Five";
		}
	}

	public static String positiveOrNegative(double num6){
		if (num6 > 0){
			return "Positive";
		}
		else{
			return "Negative";
		}
	}


	public static String highOrLow(int num7){
		if (num7 > 100){
			return "High";
	}
		else { 
			return "Low";
	}
}


	public static String isHello(String word2){
		if (word2.equals("Hello")){
			return "The word is Hello";
		}
		else{
			return "The word is not Hello";
		}
	}
	


}
