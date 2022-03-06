import java.util.Scanner;

/*
 * Dado um vetor de inteiros n e um inteiro qualquer x. 
 * Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.
 * 
 * Exemplo:
 * 
 * Entrada:
 * n = [1, 5, 3, 4, 2]
 * 
 * Saída:
 * 3
 * 
 * Explicação:
 * Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].
 * 
 */


public class Questao02 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner (System.in);
		int n[];
		int x = 0;
		int y = 0;
		int cont = 0;
		
		do {
	         System.out.print ("Digite o valor de \"x\"\n");
	         x = entrada.nextInt();
	    } while (x <= 0);
		
		do {
	         System.out.print ("Digite o número de posições do vetor \"n\"\n");
	         y = entrada.nextInt();
	    } while (x <= 0);
		
		n=new int[y];
		System.out.println ("Preencha o vetor de "+y+" posições, com números interios.");
	    for (int i = 0; i <= n.length-1; i++){
	    	n[i] = entrada.nextInt();
	    }
	    
	    for (int i = 0; i < n.length; i++) {
	    	for(int j = 0; j < n.length; j++) {
	    		if(n[i]-n[j]==x) {
	    			cont++;
	    			System.out.print ("["+n[i]+", "+n[j]+"], ");
	    		}
	    	}
	    }
	    System.out.print ("existem "+cont+" pares de inteiros no vetor com uma diferença de "+x+".");
	}
}
