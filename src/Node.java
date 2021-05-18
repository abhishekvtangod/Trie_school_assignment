import java.util.HashMap;
import java.util.Map;

public class Node {
	public int wordEnd = 0;
	public Map<Character,Node> children = new HashMap<>();
	
	Node(){}
		
	public boolean isChildX(char x) {
		if(children.containsKey(x)) {
			return true;
		}
		return false;
	}
	
	public Node getChildNodeX(char x) {
		return children.get(x);
	}
	public void extend(char x) {
		children.put(x, new Node());
	}
	
	
	public void endOfWord() {
		wordEnd++;
	}
	public int isWordEnd() {
		return wordEnd;
	}
}
