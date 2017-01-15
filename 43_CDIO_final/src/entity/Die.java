package entity;

public class Die {


		private int value;
		
		
		/**
		 * This constructs a die.
		 */
		
		public Die() {
			value = 1; 
		}
		
		/**
		 * @return returns the value of die.
		 */
		public int getValue() {
			return value;
		}
		

		/**
		 * rolls the die.
		 */
		
		public void rollDie() {
			value = (int) (Math.random() * 6) + 1;  
		}
		
	}

