package dsa;
public class Problem2{
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
		var ob = new finalAlg();
		ob.implAlg(text, regex);
	}
}
class finalAlg{
	public void implAlg(String[] text, String[] regex) {
    	int n = regex.length;
    	int m = text.length;
		for(int i=0; i<n; i++) {
				Runnable thread = new requiredAlg(text,regex[i],i,m);
				new Thread(thread).start();
		}
		
	}
}


class requiredAlg implements Runnable {

	

	public requiredAlg(String[] text, String regex, int i, int m) {
		super();
		this.text = text;
		this.regex = regex;
		this.i = i;
		this.m = m;
	}

	String[] text;
	String regex;
	int i;
	int m;

	@Override
	public void run() {
		for(int n=0; n<m; n++)
		if (text[n].matches(regex)) {
			System.out.println("String: " + (n + 1) + " matches regex: " + (i + 1));
		}

	}

}
