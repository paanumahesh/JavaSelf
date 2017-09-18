
public class Application3 {
	public static void main(String[] args) {
		int value=100;
		boolean loop = 4 < 6;
		boolean loop1 = 4 > 6;
		boolean loop2  = value < 10;
		System.out.println(loop);
		System.out.println(loop1);
		System.out.println(loop2);
		
		int limit=0;
		
		while (limit<10)
		{
			System.out.println("hello " + limit);
			
			limit = limit + 1;
			
			System.out.println(limit);
		}
		
		int loops=0;
		
		while(true)
		{
			System.out.println("looping:"+loops);
			
			if(loops==5){
				break;
			}
				loops++;
				System.out.println("Running");
			
		}
				
	}

}
