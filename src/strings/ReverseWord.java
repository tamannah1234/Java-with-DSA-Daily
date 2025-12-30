//Reverse word in String
import java.util.*;
public class Main
{
    public static String reverseWord(String str)
    {
        String arr[] = str.split(" ");
        String res = "";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()==0){
                continue;
            }
            //
            if(res.length()==0){
                res += arr[i];
            }else{
             res+=" "+ arr[i];   
            }
        }
        return res;
    }
    
    //=============Optimal==================
    public static String reverseWord1(String str)
    {
        String arr[] = str.split(" ");
        //String res = "";
        StringBuilder res = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()==0){
                continue;
            }
            //
            if(res.length()==0){
                res.append(arr[i]);
            }else{
             res.append(" ");
             res.append(arr[i]);   
            }
        }
        return res.toString();
    }
    
    
	public static void main(String[] args) {
	
		String sentence = "I love Java programming";
		String arr[]=sentence.split(" ");
		for(String ch : arr){
		    System.out.println(ch);
		}
		
	String res =	reverseWord1("      I love Java programming");
		System.out.println(res);
		
	}
}
