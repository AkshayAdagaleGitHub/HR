import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i =0;
		Map<String, Integer> map = new HashMap<>();
		sc.nextLine();
		for(i =0;i<no;i++) {
			String keyValue = sc.nextLine();
			int space = keyValue.indexOf(" ");
			String name= keyValue.substring(0, space);
			String pNumber = keyValue.substring(space+1);
			int length = pNumber.length();
			if(length>8) {
				System.out.println("Incorrect phone length");
				return;
			}else {
				int phoneNumber = Integer.parseInt(pNumber);
				map.put(name, phoneNumber);
			}
		}		
		while(sc.hasNext()) {
			String s = sc.next();
			if(map.containsKey(s)) {
				System.out.println(s +"="+ map.get(s));
			}else {
				System.out.println("Not Found");
			}
		}	
	}

}
