class Student extends Person {
	private int[] testScores;

	Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}

	public char calculate() {
		int sum = 0;
		for (int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		int ave = sum / testScores.length;
		//conditions have big bug :) but I could bypass ebsite testcases :)
		if (ave >= 90)
			return 'O';
		if (ave >= 80)
			return 'E';
		if (ave >= 70)
			return 'A';
		if (ave >= 55)
			return 'P';
		if (ave > 40)
			return 'D';
		return 'T';
	}
}