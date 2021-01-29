package exam.fruit;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a=new Apple ();
		System.out.println("-----Apple-----");
		System.out.println("Sweet : "+ a.isSweet() );
		System.out.println("Poisonous : "+ a.isPoisonous() );
		
		PoisonBerry b =new PoisonBerry();
		System.out.println("-----PoisonBerry-----");
		System.out.println("Sweet : "+ a.isSweet() );
		System.out.println("Poisonous : "+ a.isPoisonous() );

	}

}
