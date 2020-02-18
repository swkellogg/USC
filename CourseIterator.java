
public class CourseIterator implements Iterator{
	private Assignment[] assignments;
	private int position = 0;
	public CourseIterator(Assignment[] assignments) {
		this.assignments = assignments;
	}
	public boolean hasNext() {
		return assignments[position] != null && position < assignments.length;
	}
	public Assignment next() {
		return assignments[position++];
	}
}
