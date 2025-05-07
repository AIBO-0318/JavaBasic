package programing03;

import java.util.NoSuchElementException; 
import java.util.StringTokenizer;

public class TokenPrintTest {
	public static void main(String[] args) {
		String s = "of the people, by the people, for the people"; 
        try { 
            showTokens(s, ", "); 
        } catch (NoSuchElementException e) { 
            System.out.println("끝"); 
        } 
    }
    
    // 비검사형이여서 showTokens에 throws NoSuchElementException을 안 붙여줘도 된다.
    public static void showTokens(String s, String s2) throws NoSuchElementException { 
        StringTokenizer st = new StringTokenizer(s, s2); 
        while (true) { 
            System.out.println(st.nextToken()); 
        } 
    } 
}