public class NumeroLetra{
	public static void main(String[] args){
		int num = 5;
		String numeroTexto= "Texto desconocido";

		if (num == 1){
			numeroTexto = "UNO";
}		else if (num == 2){
			numeroTexto = "DOS";
}		else if(num == 3){
			numeroTexto = "TRES";
}		else if(num == 4){
			numeroTexto = "CUATRO";
}		else{
			numeroTexto = "NUMERO NO ENCONTRADO";
}
			System.out.println(numeroTexto);
}
}
