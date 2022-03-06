import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Questão 3 Desafio de programação CAPGEMINI 02.
 * @author Antonio Janes
 */

public class Questao03 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner (System.in);
		String s;
		char aux[];
		int numChar, iRaiz, i, j, y, z;
		double raiz;
		
		
		System.out.print ("Digite uma frase para ser encriptada:\n");
		s = entrada.nextLine();
        s = s.replace(" ", "");
        s = misturar(s); 
        aux = s.toCharArray();
        numChar = aux.length;
        raiz = Math.sqrt(numChar);
        iRaiz = (int)Math.round(raiz);
        y=iRaiz;
      
        for (i=0; i<aux.length;){
        	for (j=i; j<y; j++){
        		if(j<aux.length) {
        			System.out.print(aux[j]);
        			i++;
        		}
        	}
        	System.out.print(" ");
        	if(numChar%iRaiz!=0) {
        		z = numChar-iRaiz;
        		raiz = Math.sqrt(z);
        		iRaiz = (int)Math.round(raiz);
        	}
        	y=y+iRaiz;
        }
        
	}
	
	public static String misturar(String s) {
		ArrayList<String> letras = new ArrayList<String>(Arrays.asList(s.split("")));
	    Collections.shuffle(letras);
	    StringBuilder t = new StringBuilder(s.length());
	    for (String k : letras) {
	        t.append(k);
	    }
	    return t.toString();
	}
	
}
