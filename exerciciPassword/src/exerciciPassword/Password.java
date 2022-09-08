package exerciciPassword;

import java.util.Arrays;

public class Password {
	
	private int longitud = 8;
	
	
	// Por defecto
	public Password() {
		
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		
	}
	
	public String generatePassword(int longitud) {
		
		String digitos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		//61
		String[] arrayDigitos = digitos.split("");
		String password = "";
		
		for (int i = 0; i < longitud; i++) {
			 
			double numeroAleatorio = Math.random()*62;
			
			password += arrayDigitos[(int)numeroAleatorio];
	
			
		}
		
		return password;
	}
	
	
	
	
	

}
