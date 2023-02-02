package Algorism;

public class Greedy_Algorism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int count = 0;
//		int[] coinType = {500, 100, 50 , 10};
//		int a = 1260;
//		
//		for (int i = 0; i < 4; i++) {
//			int coin = coinType[i];
//			//System.out.println(coin);
//			
//			count += a / coin;
//		//	System.out.println(count);
//			
//			a = a % coin;
//			System.out.println(coin + " ==== won "+count + " === EA " + " change money====" + a);
//		}
//		//System.out.println(count);
//		
//		
		
		
		int count = 0;
		int[] coinType = {500, 100, 50, 10};
		int change = 1870;
			
		for(int a = 0; a < coinType.length; a++) {
			int coin = coinType[a];
			 
			count += change / coin ;
			
			change = change % coin;
			
			System.out.println("Coin Type ---> " +  coin );
			System.out.println("Coin count ---> " +  count );
			System.out.println("Coin change price 나머지 --->   " + change);
			
		}
		
		System.out.println("Total coin :    " + count);
		
		
		
		
		
		
	}

}
