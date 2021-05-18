import java.util.Scanner;

public class Autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autocomplete app = new Autocomplete();
		app.run();
	}
	
	public void run() {
		
		Trie autoCompleteDictionary = new Trie();
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		while(true) {
			System.out.println("Enter choice: \n1.Enter word to Dictionary \n2."
					+ "Enter Prefix to get Autocomplete suggestions \n3.To terminate");
			n = sc.nextInt();
			if(n == 1) {
				System.out.println("Enter the word to add in Dictionary: ");
				s = sc.next();
				autoCompleteDictionary.add(s);
				
			} else if( n == 2) {
				System.out.println("Enter prefix: ");
				s = sc.next();
				autoCompleteDictionary.clear_ans();
				Node last_node = autoCompleteDictionary.getPrefixEnd(s);
				if(last_node.wordEnd == -1) {
					System.out.println("No suggestions");
					continue;
				}
				autoCompleteDictionary.dfs(last_node, s);				
				System.out.println(autoCompleteDictionary.ans);
			} else {
				sc.close();
				break;
			}
		
		}
	}
}


