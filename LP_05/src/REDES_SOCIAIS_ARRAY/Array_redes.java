package REDES_SOCIAIS_ARRAY;
import javax.swing.JOptionPane;
import java.util.*;
public class Array_redes {

	public static void main(String[] args) {		
	     
	     int i,j;
	     ArrayList<String> rede = new ArrayList();
		
		 do
	     {
	     String menu = JOptionPane.showInputDialog("MENU\n1 - Cadastrar\n2 - Excluir\n3 - Pesquisar\n4 - Sair");
	     i = Integer.parseInt(menu);
	     
	     switch (i)
	        {
	             case 1:
	            	//ArrayList: nome, telefone, usuário do Instagram(@) e e-mail.
	                String nome = JOptionPane.showInputDialog("Digite o Nome: ");
	                String telefone = JOptionPane.showInputDialog("Digite o telefone: ");
	                String insta = JOptionPane.showInputDialog("Digite o insta: ");
	                String email = JOptionPane.showInputDialog("Digite o email: ");
	                rede.add(nome+";"+telefone+";"+insta+";"+email);
	                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
	                break;
	            
	             case 2:
	            	//A opção Excluir deverá solicitar alguma informação do cadastro,
	            	// localizar o registro e excluí-lo.
	                String excluir = JOptionPane.showInputDialog("Digite o que deseja excluir: ");       
	                
	                 try {
	                	 int n = rede.size();
	                	 {
	                		 for (i=0; i<n; i++)
	                		 {
	                			 if(rede.get(i).contains(excluir))
	                			 {
	                				 rede.remove(i);
	                				 JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
	                			 }
	                		 }
	                	 }
	                  } catch (IndexOutOfBoundsException e) {
	                      System.out.printf("\nErro: posição inválida (%s).",
                		  e.getMessage());
	                  }
	                 break;
	             case 3:
	            	 //A opção Pesquisar deverá solicitar alguma informação e pesquisar no
	            	 //ArrayList, se existir deverá retornar todos os dados, caso contrário uma
	            	 //mensagem de “Registro não Encontrado”
	            	 String pesquisar = JOptionPane.showInputDialog("Digite o que deseja pesquisar: ");
		                
		                
		                try {
		                	int p = rede.size();
			                for (i=0; i<p; i++) {
			                  if (rede.get(i).contains(pesquisar))
	                		  {
			                	  rede.get(i);
			                	  JOptionPane.showMessageDialog(null,rede.get(i));
		               		  }	
			                  else if (!rede.get(i).contains(pesquisar)&& i==p-1)
			                  {
			                	  JOptionPane.showMessageDialog(null,"dddRegistro não Encontrado");
			                  }
		                	 }
             
		                  } catch (IndexOutOfBoundsException e) {
		                      System.out.printf("\nErro: Registro não Encontrado(%s).",
                    		  e.getMessage());
		                  }break;
	             case 4:
	                 break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
	        }
	     } while (i!=4);
	}
}
