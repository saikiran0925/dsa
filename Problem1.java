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
		String[] regex = {
				".*\\.$",
				".*\\d{10}.*",
				".*@.*",
				"\\w+",
				".*\\s.*"
		};
		for(int i=0; i<10; i++) {
			for(int j=0; j<5; j++ ) {
				 if(text[i].matches(regex[j])) {
					 System.out.println("String: " + (i+1) +" matches regex: " + (j+1));
				 }
			}
		}
	}

}
