package crud;

import java.util.*;

private static void exibicaoM(){
  
System.out.println("Digite a opção desejada de acordo com o menu:");
System.out.println("1 - Incluir produto");
System.out.println("2 - Alterar produto");
System.out.println("3 - Excluir produto");
System.out.println("4 - Listar todos os produtos");
System.out.println("5 - Listar um produto");
System.out.println("0 - Sair");
    }
}

public class Main {
    public static void main(String[] args) {
        Aplicacao aplicacao = new Aplicacao();

Scanner sc = new Scanner(System.in);

int opcao;
String input;
        
while (true) 
    {
    exibicaoM();

input = sc.nextLine();
try 
      {
      opcao = Integer.parseInt(input);
   } 
catch (NumberFormatException e) 
            {
System.out.println("Opção inválida. Digite um número inteiro.");
 continue;
   }
if (opcao == 0) 
{
  break;
}

switch (opcao) 
   {
       
case 1:
aplicacao.IncluirProd();
      break;
       
case 2:
aplicacao.AlterarProd();
       break;
                
case 3:
aplicacao.excluirProd();
       break;
                
case 4:
aplicacao.listarTodosProd();
       break;
                
case 5:
aplicacao.listarProduto();
       break;
       default:
                
System.out.println("Opção inválida");
       break;
       }
  }
sc.close();
}


