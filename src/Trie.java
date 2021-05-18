import java.util.Set;
import java.util.TreeSet;
public class Trie {
	Node root = new Node();
	void add(String word) {
		word = word.toLowerCase();
		Node node = root;
		for(char c: word.toCharArray()) {
			if(node.isChildX(c)) {
				node = node.getChildNodeX(c);
			} else {
				node.extend(c);
				node = node.getChildNodeX(c);
			}
		}
		node.endOfWord();
		
	}
	Node getPrefixEnd(String word) {
		word = word.toLowerCase();
		Node node = root;
		node.wordEnd = -1;
		for(char c: word.toCharArray()) {
			if(node.isChildX(c)) {
				node = node.getChildNodeX(c);
			} else {
//				Node temp = new Node();
//				temp.wordEnd = -1;
				return root;
			}
		}
		return node;
	}
	//Set<String> ans = new TreeSet<String>();
	Set<Pair> ans = new TreeSet<Pair>();
	public void clear_ans() {
		ans.clear();
	}
	public void dfs(Node node, String word) {
		if(node.isWordEnd()>0) {
			Pair temp = new Pair(node.isWordEnd(), word);
			ans.add(temp);
		}
		Set<Character> keySet = node.children.keySet();
		for(Character c: keySet) {
			dfs(node.getChildNodeX(c), word+c);
		}
	}
	
}
