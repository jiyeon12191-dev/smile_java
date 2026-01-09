package test;

public class test6 {

	public static void main(String[] args) {
		int[] scores = {87,65,92,100,74};
		int min=scores[0];
		int max=0;
		for(int i=0; i<scores.length;i++) {
			if(scores[i]>max)max=scores[i];
			if(scores[i]<min)min=scores[i];
			
		}
System.out.println(max+" "+min+" ");
	}

}
