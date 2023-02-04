import java.util.LinkedList;
import java.util.Scanner;

public class Solution{
	
	private LinkedList<Character> queue = new LinkedList<Character>();
	private LinkedList<Character> stack = new LinkedList<Character>();

	private char popCharacter() {
		return stack.removeLast();
	}


	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public int size() {
		return queue.size();
	}

	private char dequeueCharacter() {
		return queue.removeFirst();
	}



	public void enqueueCharacter(char c) {
		queue.addLast(c);		
	}



	private void pushCharacter(char c) {
			stack.add(c);
	}
	
	
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }




}