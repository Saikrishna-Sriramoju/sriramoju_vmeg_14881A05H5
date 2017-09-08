import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentGroup implements GroupOperationService {

	private Student[] students;
	
	public StudentGroup(int length) {

	}

	@Override
	public Student[] getStudents() {
	return students;
		}

	@Override
	public void setStudents(Student[] students) {
return students;

	}

	@Override
	public Student getStudent(int index) {
	return students[index];

	}

	@Override
	public void setStudent(Student student, int index) {
	students[index]=student;
        return students;

	}

	@Override
	public void addFirst(Student student) {
	 
   	 int[] result = new int[students.length+1];
  	 result[0]=student;
	 for(int i = 1; i < result.length; i++)
        result[i] = students[i];
 
    return result;
	}






	

	@Override
	public void addLast(Student student) {
int[] result = new int[students.length+1];
result[result.length-1]=student;
 for(int i = 0; i < result.length-1; i++)
        result[i] = students[i];
  return result;
	}

	@Override
	public void remove(int index) {
int[] result = new int[students.length-1];
for(int i=0;i<result.length;i++){
if(i!=index){result[i]=students[i];}
else{i--;}
return result;

}



	}

	@Override
	public void remove(Student student) {

int[] result = new int[students.length-1];
for(int i=0;i<result.length;i++){
if(students[i]!=student){result[i]=students[i];}
else{i--;}
return result;

}

	@Override
	public void removeFromIndex(int index) {

int[] result = new int[index];
for(int i=0;i<result.length;i++){
result[i]==students[i];
}
return result;



}




	@Override
	public void removeFromElement(Student student) {


	}

	@Override
	public void removeToIndex(int index) {

	}

	@Override
	public void removeToElement(Student student) {

	}

	@Override
	public void bubbleSort() {

	}

	@Override
	public Student[] getByBirthDate(Date date) {

	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {

	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {

	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {

	}

	@Override
	public Student[] getStudentsByAge(int age) {

	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {

	}

	@Override
	public Student getNextStudent(Student student) {

	}

	@Override
	public void add(Student student, int index) {

	}

	private int getStudentIndex(Student student) {

	}

	private int getDiffYears(Date first, Date last) {

	}

	private Calendar getCalendar(Date date) {

	}
}