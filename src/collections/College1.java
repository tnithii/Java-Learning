package collections;

import java.util.ArrayList;
import java.util.List;

public class College1 {
	List<Feedback1> feedbackList=new ArrayList<Feedback1>();
	 public void addFeedback(Feedback1 feedback)
	    {
	        feedbackList.add(feedback);
	    }
	  public List<Feedback1> viewAllFeedbacks()
	    {
	        return feedbackList;
	    }
	  public List<Feedback1> viewFeedbackbyCourse(String name)
	    {
	        List<Feedback1> t1=new ArrayList<Feedback1>();
	        for(Feedback1 i:feedbackList)
	        {
	            if(i.getCourseName().equals(name))
	            t1.add(i);
	        }
	        return t1;
	    }
	    public Feedback1 getHighestFeedback()
	    {
	        int m=feedbackList.get(0).getFeedbackRating();
	        Feedback1 f=feedbackList.get(0);
	        for(Feedback1 i:feedbackList)
	        {
	            if(i.getFeedbackRating()>m)
	            {
	                m=i.getFeedbackRating();
	                f=i;
	            }
	        }
	        return f;
	    }
	  
}
