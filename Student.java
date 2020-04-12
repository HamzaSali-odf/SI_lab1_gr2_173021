class Faculty {

	List<Student> students;

	public Faculty() {
		this.students = new ArrayList<Student>();

	}

	public void addStudent(Student student) {
		this.students.add(student)
	}

	public void removeStudent(Student student) {
		this.students.remove(student)
	}

	public double avgGrades() {
		double sum=0;
		for (int i = 0; i < students.size(); i++) {
			sum+=students.get(i).getAverage();
		}
		return sum/students.size();
	}

}

class Student {
	String index;
	String firstName;
	String lastName;
	int []grades;
	//TODO constructor

	public Student(String index, String firstName, String lastName, int[] grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public double getAverage() {
		//TODO
		double suma=0;
		for (int i = 0; i < grades.length; i++) {
			suma += grades[i];
		}
		double avg = suma/grades.length;
		return avg;
	}

	public int ECTSCredits() {
		//TODO
		int krediti;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > 5) {
				krediti+=6;
			}
		}
		return krediti;
	}
}

