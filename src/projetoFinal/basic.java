package projetoFinal;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class basic {

	public static void main(String[] args) {

		JFrame janelaCadastro = new JFrame();
		JPanel painel1 = new JPanel();				
		JPanel painel2 = new JPanel();	
		
		
		
		janelaCadastro.setTitle("Cadastro De Usuário");
		janelaCadastro.setSize(300, 200);
		janelaCadastro.setLocation(50, 50);
		janelaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
