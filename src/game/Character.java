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
			System.out.println("Let´s test timing loggin in YouTrack");
		weapon = w;
		}
		public void fight(){ 
	        weapon.useWeapon();
	    }
		public abstract void display();

}
