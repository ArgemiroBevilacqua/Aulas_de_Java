package Excecoes;
public class Main {
		public static void main (String [] args)
		{
			try 
			{
				int [] numeros = {1,2,3};
				System.out.println(numeros [10]);
				
			}
			
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Indece do Array fors dos limites!");
				
			}finally
			{
				System.out.println("Este bloco 'finally' sempre será execetado");
			}
		}
}
