
public class Course {
	Assignment[] assignments = new Assignment[5];
	int count;
	String name;
	String title;
	
	public Course(String name){
		this.name = name;
	}
	
	public void addAssignment(String title, String description, String topic, int points) {
		if (count >= assignments.length) {
			assignments = growArray(assignments);
		}
		assignments[count++] = new Assignment(title, description, topic, points);
		
	}
	public CourseIterator createIterator() {
		return new CourseIterator(assignments);
	}
	public double getAssignmentWeights() {
		return 100/count;
	}
	public String toString() {
		return name + ", " + title;
	}
	public Assignment[] growArray(Assignment[] first) {
		Assignment[] temp = new Assignment[first.length*2];
		for(int i = 0; i < first.length; i++) {
			temp[i] = first[i];
		}
		return temp;
	}

}
