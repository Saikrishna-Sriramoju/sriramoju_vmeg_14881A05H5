

import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
return students;
	}

	@Override
	public void setStudents(Student[] students) {

	
		if(students==null)
		{
			throw IllegalArgumentException;
		}
		else
		{
			return students;
		}
		// Add your implementation here
		return null;


		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		try{
			if(index<0||index>=students.length)
			{
				throw IllegalArgumentException;
			}
			else
			{

				return students[index];
			}
		}//try end
		catch (Exception e)
		{
			System.out.println(e);
		}




		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
	try{
			if(index<0||index>=students.length||student==null)
				{
				throw IllegalArgumentException;
				}
			else
				{
			students[index]=student;
				}

		}//try end
	catch(Exception e)
		{
		System.out.println(e);
		}

		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {

		try{
			if(student==null)
			{
			throw IllegalArgumentException;
			}else{

			Student[] r=new Student[students.length+1];
			r[0]=student;
			for(int i=1;i<r.length;i++)
				{
				r[i]=students[i];
				}
				Student[] students=new Student[r.length]
					for(int i=0;i<r.length;i++)
				{
				
				students[i]=r[i];
				
				}

			}
		}//try end
		catch(Exception e)
		{
			System.out.println(e);
		}

		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		try{
			if(student==null)
			{
			throw IllegalArgumentException;
			}else{

			Student[] r=new Student[students.length+1];
			r[r.length-1]=student;
			for(int i=0;i<r.length-1;i++)
				{
				r[i]=students[i];
				}
				Student[] students=new Student[r.length]
					for(int i=0;i<r.length;i++)
				{
				
				students[i]=r[i];
				
				}

			}
		}//try end
		catch(Exception e)
		{
			System.out.println(e);
		}



		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		try{
			if(student==null||index<0||index<=student.length)
			{
			throw IllegalArgumentException;
			}else{

			Student[] r=new Student[students.length+1];
			
			for(int i=1;i<r.length;i++)
				{
				if(i!=index){
				r[i]=students[i];}
				else{r[index]=student;}
				}
				Student[] students=new Student[r.length]
					for(int i=0;i<r.length;i++)
				{
				
				students[i]=r[i];
				
				}


			}
		}//try end
		catch(Exception e)
		{
			System.out.println(e);
		}



		// Add your implementation here
	}

	@Override
	public void remove(int index) {

try{
			if(index<0||index<=student.length)
			{
			throw IllegalArgumentException;
			}else{Student[] r=new Student[students.length-1];
				for(int i=0;i<r.length;i++)
				{
				if(i!=index){
				r[i]=students[i];}
				else{--i;}
				}

				Student[] students=new Student[r.length]
					for(int i=0;i<r.length;i++)
				{
				
				students[i]=r[i];
				
				}

			
			}

}
catch(Exception e)
		{
			System.out.println(e);
		}

		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		try{int c=0;
			if(student==null)
			{
throw IllegalArgumentException;
			}
			else{Student[] r=new Student[students.length-1];
				for(int i=0;i<r.length;i++)
				{
				if(students[i]!=student){
				r[i]=students[i];}
				else{--i;c=1;}
				}
				if(c==1)
				{System.out.println("Student not exist");throw IllegalArgumentException;}
				Student[] students=new Student[r.length]
					for(int i=0;i<r.length;i++)
				{
				
				students[i]=r[i];
				
				}

			
			}
		}//try
		catch(Exception e)
		{
			System.out.println(e);
		}

		
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		try{int c=0;
			if(index<0||index<=student.length)
			{
throw IllegalArgumentException;
			}
			else{Student[] r=new Student[index+1];
			
			for(int i=0;i<r.length;i++)
				{
				
				r[i]=students[i];
				
				}
				Student[] students=new Student[r.length]
					for(int i=0;i<r.length;i++)
				{
				
				students[i]=r[i];
				
				}


			}

		}//try end
		catch(Exception e)
		{System.out.println(e);}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		try{int c=0;
			if(student==null)
			{
throw IllegalArgumentException;
			}
			else{for(int i=0;i<students.length;i++)
				{if(students[i]==student){c=i;break;}}
				Student[] r=new Student[c+1];
			
			for(int i=0;i<r.length;i++)
				{
				
				r[i]=students[i];
				
				}
				Student[] students=new Student[c+1]
					for(int i=0;i<r.length;i++)
				{
				
				students[i]=r[i];
				
				}


			}

		}//try end
		catch(Exception e)
		{System.out.println(e);}
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
			try{int c=0;
			if(index<0||index<=student.length)
			{
throw IllegalArgumentException;
			}
			else
				{
				Student[] r=new Student[students.length-index+1]
				for(int i=index;i<=student.length-1;i++)
					{r[i]=students[i];}

				}
					Student[] students=new Student[r.length]
					for(int i=0;i<r.length;i++)
				{
				
				students[i]=r[i];
				
				}





		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		try{int c=0;
			if(student==null)
			{
throw IllegalArgumentException;
			}
			else{for(int i=0;i<students.length;i++)
				{if(students[i]==student){c=i;break;}}

			
				Student[] r=new Student[students.length-c+1]
				for(int i=c;i<=student.length-1;i++)
					{r[i]=students[i];}

				}
					Student[] students=new Student[r.length]
					for(int i=0;i<r.length;i++)
				{
				
				students[i]=r[i];
				
				}




		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
