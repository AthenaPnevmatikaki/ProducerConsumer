
public class IlegalArgumentException extends Exception{
	
	
	IlegalArgumentException(String argument) {
		super (argument + " can't be 0.");
	}
}
 