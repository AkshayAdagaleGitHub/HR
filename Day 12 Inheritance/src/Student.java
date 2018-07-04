
class Student extends Person{
	
	private int[] testScores;
	
	Student(String firstName, String lastName, int identification,int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}
       /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here


	public String calculate() {
		int n=0,sum=0,average=0;
		for(n =0;n<testScores.length;n++) { 
			sum = sum + testScores[n]; 
		}
		average=sum/(n);
		System.out.println("Average is :" + average);
		String grade="T";
		if(average>=90 && average<=100) {
			grade="O";
		}else if(average>=80 && average<90) {
			grade="E";
		}else if(average>=70 && average<80) {
			grade="A";
		}else if(average>=55 && average<70) {
			grade="P";
		}else if(average>=40 && average<55) {
			grade="D";
		}else if(average<40) {
			grade="T";
		}
		return grade;
	}
	
}
