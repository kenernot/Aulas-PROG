public class ConteudoString {
	
	public static void main(String[] args) {
		
		String minhaString = new String("meu texto");
		String outraString = "meu outro texto";
		
		String t = new String("teste");
		System.out.println(t.length());
		
		System.out.println(t.charAt(2));
		System.out.println("O "+t.charAt(2)+ " em byte é "+
			Byte.valueOf( (byte) t.charAt(2)));
			
		t = t.concat("@abc");
		System.out.println(t);
		
		System.out.println(t.contains("@"));
		
		System.out.println(t.indexOf("@"));
		
		String cpf = "085.007.649-88";
		String email = "lukas_jacoby@hotmail.com";
		
		
		System.out.println(cpf.matches("^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}$"));
		System.out.println(email.matches("^[a-z0-9\\-_\\.]+@[a-z0-9]+\\..+$"));
		
		System.out.println(t.compareTo("teste@"));
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());
		
		String[] split = t.split("@");
		System.out.println(split[0]);
		System.out.println(split[1]);
		
		ValidaCpf validador = new ValidaCpf();
		System.out.println(validador.validar(cpf));
	}
	
}