class Pair implements Comparable<Pair>{
		public int freq;
		public String word;
		Pair(int freq, String word) {
			this.freq = freq;
			this.word = word;
		}
		
		public int compareTo(Pair p) {
			if(freq == p.freq) {
				return word.compareTo(p.word);
			} else {
				return p.freq - freq;
			}
		}
		public String toString() {
			return word;
		}
		
}
