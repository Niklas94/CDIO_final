package entity;

public class Die {

		//Variabel
		private int value;
		
		
		//Konstruktoer
		public Die() {
			value = 1; 
		}
		
		//Getter 
		public int getValue() {
			return value;
		}
		
		//Setter 
		public void setValue(int a) {
			if (a > 0 && a < 7) {
				value = a;
			}
			else
				value = 1;
		}
		
		//Tilfaeldig vaerdi
		public void rollDie() {
			value = (int) (Math.random() * 6) + 1;  
		}
		
	}

