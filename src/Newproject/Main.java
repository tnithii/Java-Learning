package Newproject;

public class Main {
    public static void main(String[] args){
        String str="123:9874561230:2.5";
        Call obj=new Call();
        obj.parsedata(str);
        System.out.println("call id: "+obj.getCallid());
        System.out.println("call number: "+obj.getCallnumber());
        System.out.println("call duration: "+obj.getDuration());


    }
}
