package ex01;

public abstract class EnemyShip{
	private String name;
	private double damage;
	
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public double getDamage() {return damage;}
	public void setDamage(double Damage) {this.damage = Damage;}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}
	
	public void displayEnemyhip() {
		System.out.println(getName() + " is on screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + "attacks and does: "+getDamage());
	}
	
}
