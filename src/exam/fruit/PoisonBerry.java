package exam.fruit;

public class PoisonBerry implements Fruit {

	@Override
	public boolean isSweet() {
		return false;
	}

	@Override
	public boolean isPoisonous() {
		return true;
	}

}
