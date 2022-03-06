import java.util.Scanner;

/*
 * A mediana de uma lista de n�meros � basicamente o elemento que se encontra no meio da lista ap�s a ordena��o.
 * Dada uma lista de n�meros com um n�mero �mpar de elementos, desenvolva um algoritmo que encontre a mediana.
 * Exemplo:
 * 
 * Entrada:
 * arr = [9, 2, 1, 4, 6]
 * 
 * Sa�da:
 * 4
 * 
 * 
 */

public class Questao01 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner (System.in);
		int n, meio, x = 0;
		float valores[], aux;
		
		
		do {
	         System.out.print ("Quantos valores deseja informar? (Apenas n�meros impares)");
	         n = entrada.nextInt();
	         if(n%2==0) {
	        	 System.out.print ("Por favor, digite um n�mero impar\n");
	        	 n=0;
	         }
	    } while (n <= 0);
		
		valores=new float[n];
		System.out.println ("Informe "+n+" valores: ");
	    for (int i = 0; i <= valores.length-1; i++){
	    	valores[i] = entrada.nextFloat();
	    }
		
	    aux = 0;
	    do {
	    	x=0;
	    	for (int i = 0; i < valores.length-1; i++) {
	    		if (valores[i] > valores[i+1]) {
	    			aux=valores[i];
	    			valores[i]=valores[i+1];
	    			valores[i+1]=aux;
	    			x++;
	    		}
	    	}
	    }while(x!=0);
	    
	    meio=(int)valores.length/2;
	    
	    for (int i = 0; i < valores.length; i++) {
	    	 System.out.print ("Posi��o"+i+" ="+valores[i]+".");
	    }
	    
	    System.out.print ("\nA mediana dos n�meros informados � "+valores[meio]+".");
	}
}
