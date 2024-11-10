package dsa;

public class Problem1 {

	public static void main(String[] args) {
		String[] text = { "The patient should be informed of his therapeutic options.",
				"It wouldn't be as if the lone astronaut would be completely by himself.",
				"Now, a writer is entitled to have a Roget on his desk.",
				"Somebody should let you borrow their book",
				"From the earliest times until about the 1960s",
				"whether we may not, nay ought not, to use a neutral pronoun relative",
				"phone 9280018281",
				"Notionalplurality", 
				"A starting point would be to give more support", 
				"abc@gmail.com" };
		String[] regex = { ".*\\.$",
				".*\\d{10}.*",
				".*@.*", 
				"\\w+",
				".*\\s.*" };
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (text[j].matches(regex[i])) {
					System.out.println("String: " + (j + 1) + " matches regex: " + (i + 1));
				}
			}
		}
	}

}

//Algorithm if we want to pass texts and regex as String arrays.
//class Algorithm{
//	public void requiredAlg(String[] text, String[] regex) {
//		int m = text.length;
//		int n = regex.length;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++ ) {
//				 if(text[j].matches(regex[i])) {
//					 System.out.println("String: " + (j+1) +" matches regex: " + (i+1));
//				 }
//			}
//		}
//	}
//}
