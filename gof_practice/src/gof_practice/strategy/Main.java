package gof_practice.strategy;

public class Main {
	public static void main(String[] args) {
		GameCharacter py = new GameCharacter();
		py.attack();
		
		py.setWeapon(new Knife());
		py.attack();
		
		py.setWeapon(new Sword());
		py.attack();
	}
}
