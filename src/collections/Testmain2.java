package collections;

import java.util.*;

public class Testmain2 {
	
	public static ArrayList<Object> retrieveStudentInfo(ArrayList<Student2> al,String schoolName)
	{
		ArrayList<Object> str=new ArrayList<Object>();
	      for(int i=0;i<al.size();i++){
	      Student2 s=al.get(i);
	      if(s.getSchoolName().equalsIgnoreCase(schoolName))
	      {
	          str.add(s.getStudName());
	          str.add(s.getStudId());
	      }
	    }
	      return str;
	    }
	public static void main(String[] args) {
	
Student2 s1=new Student2();
s1.setStudId(1);
s1.setStudName("John");
s1.setSchoolName("ZEE");
Student2 s2=new Student2();
s2.setStudId(2);
s2.setStudName("Tom");
s2.setSchoolName("ZEE");
Student2 s3=new Student2();
s3.setStudId(3);
s3.setStudName("yazhini");
s3.setSchoolName("BEE");
Student2 s4=new Student2();
s4.setStudId(4);
s4.setStudName("magizhini");
s4.setSchoolName("OX-FO");
Student2 s5=new Student2();
s5.setStudId(5);
s5.setStudName("Alice");
s5.setSchoolName("ZEE");

ArrayList<Student2> studentInfo=new ArrayList<Student2>();
studentInfo.add(s1);
studentInfo.add(s2);
studentInfo.add(s3);
studentInfo.add(s4);
studentInfo.add(s5);
/*for(Student2 i:studentInfo)
{

    System.out.println(i.getStudName());
    System.out.println(i.getStudId());
    System.out.println(i.getSchoolName());
    System.out.println("--------");
}*/
ArrayList<Object> retrieveStudent=retrieveStudentInfo(studentInfo,"bee");
for(int i=0;i<retrieveStudent.size();i++)
{
    System.out.println(retrieveStudent.get(i));
//System.out.println(retrieveStudent.getStudId(i));
}
}

}
