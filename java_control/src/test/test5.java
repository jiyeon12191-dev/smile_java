package test;

public class test5 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int tot=0;
		int avg=0;
		for(int i=0; i<arr.length;i++){
			tot+=arr[i];
		}
        avg=tot/arr.length;
        System.out.println(avg);
        System.out.println(tot);
	}

}
