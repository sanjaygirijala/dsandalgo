
public class TrieWordSearch {
	
	
	public static class Node{
		
		private static int NO_OF_CHAR=26;
		Node[] children =new Node[NO_OF_CHAR];
		int size=0;
		
		private int getCharIndex(char c) {
			
			return c-'a';
		}
		
		
		private Node getNode(char c) {
			
			return children[getCharIndex(c)];
		}
		
		private void setNode(char c, Node n) {
			
			children[getCharIndex(c)]= n;
		}
		
		private void add(String s) {
			add(s,0);
		}
		
		private void add(String s, int index) {
			
			size++;
			
			if(index==s.length()) {
				return;
			}
			
			char current=s.charAt(index);
			Node child=getNode(current);
			if(child == null) {
				child=new Node();
				setNode(current, child);
			}
			child.add(s,index+1);
			
		}
		
		public int findCount(String s, int index) {
			
			if(s.length()== index) {
				return size;
			}
			char current=s.charAt(index);
			Node child= getNode(current);
			if(child == null) {
				return 0;
			}else {
				return child.findCount(s,index+1);
			}
		}
		
		
	}

}
