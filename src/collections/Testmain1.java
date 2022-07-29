package collections;

import java.util.*;
import java.util.Scanner;

public class Testmain1 {


static Scanner sc=new Scanner(System.in);
public static Feedback1 getObj()
{
	   Feedback1 f=new Feedback1();
       System.out.println("Enter the feedback id:");
       f.setFeedbackId(sc.nextInt());
       System.out.println("Enter the course name:");
       f.setCourseName(sc.next());
       System.out.println("Enter the faculty id:");
       f.setFacultyId(sc.nextInt());
       System.out.println("Enter the feedbackRating:");
       f.setFeedbackRating(sc.nextInt());
       return f;
}
public static void printObj(Feedback1 f)
{
    System.out.println("Feedback Id:"+f.getFeedbackId());
    System.out.println("Course Name:"+f.getCourseName());
    System.out.println("Faculty Id:"+f.getFacultyId());
    System.out.println("Feedback Rating:"+f.getFeedbackRating());
}

public static void main(String[] args) {

    int cn;
    College1 c=new College1();
    do {
    	   System.out.println("1.Add Feedback\n2.View All Feedback\n3.Search Feedback by courseName\n4.Get highest Feedback\n5.Exit");
           System.out.println("Enter your choice");
           cn=sc.nextInt();
           if(cn>5)
        	   System.out.println("invalid choice");
           
           else {
           switch(cn)
           {
           case 1:
        	   Feedback1 f=getObj();
               c.addFeedback(f);
               break;
           case 2:
        	   List<Feedback1> f1=c.viewAllFeedbacks();
               for(Feedback1 i:f1)
               printObj(i);
           case 3:System.out.println("Enter the Course Name:");
           List<Feedback1> f2=c.viewFeedbackbyCourse(sc.next());
           for(Feedback1 i:f2)
           printObj(i);
           case 4:printObj(c.getHighestFeedback());
           break;
           case 5:
        	   System.out.println("Thanks for choosing our app");
        	   break;
        	 
           }
           }
    }
    while(cn!=5);
    	 

	}

}
