import java.util.Scanner;

public class Pessoa {

	 Scanner entrada = new Scanner(System.in);
	    String nome;
	    String endereco;
	    int telefone;
	    

	    public void imprimir(){
	     System.out.println("Dados " + "\nNome: " + nome + " endereco:  " +  endereco  + " Telefone: " + telefone);
	    
	    }
	   public void construtor(){
	    	 
	        
	        System.out.println("Informe o nome da pessoa");
	        nome = entrada.next();
	        
	        System.out.println("Informe endere�o da pessoa");
	        endereco = entrada.next();
	        
	        System.out.println("Informe o telefone da pessoa");
	        telefone = entrada.nextInt();
	    }
	   
	    }
	