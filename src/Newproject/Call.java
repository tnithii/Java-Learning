package Newproject;

public class Call {
    private int callid=0;
    public long callnumber=0;
    private float duration=0;
    
    public void parsedata(String str) {
    	callid=Integer.parseInt(str.substring(0,3));
        callnumber=Long.parseLong(str.substring(4,14));
        duration=Float.parseFloat(str.substring(15));
      
    }
   
    public int getCallid() {
        return this.callid;
    }
    public long getCallnumber() {
        return callnumber;
        }
    
    public float getDuration() {
        return this.duration;
    }
}

