package game;

public abstract class Character {

		private WeaponBehaviour weapon;
		
		public Character(WeaponBehaviour w){
			weapon = w;
		}
		public WeaponBehaviour getWeapon(){
			return weapon;
		}
		public void setWeapon(WeaponBehaviour w){
			System.out.println("Let´s change our weapons ...");
		weapon = w;
		}
		public void fight(){ 
	        weapon.useWeapon();
	    }
		public abstract void display();

}
