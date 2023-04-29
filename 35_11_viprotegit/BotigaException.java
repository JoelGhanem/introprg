/*Aquesta classe es la excepcio botiga que hem creat per aquesta botiga en concret*/
public class BotigaException extends Exception{
		public BotigaException() {
				super("Botiga plena");
		}
		public BotigaException(String text) {
				super(text);
		}
}
