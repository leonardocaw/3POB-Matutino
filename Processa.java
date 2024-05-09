package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processa{
  private List<Produto> produtos;

public Processa(){
produtos = new ArrayList<>();
}
	    
public void IncluirProd() {
	  Scanner sc = new Scanner(System.in);
	    	
int id;
String nome, descricao, fabricante, codBarras, sku, categoria;
double peso, preco;
	    	
System.out.println("Digite o ID do produto:");
	  id = sc.nextInt();
	    sc.nextLine();
	        
System.out.println("Informe o código de barras: ");
	   codBarras = sc.next();
	     sc.nextLine();
	        
System.out.println("Informe o SKU do produto:");
	   sku = sc.nextLine();
	      sc.nextLine();
	        
System.out.println("Nome do produto:");
	   nome = sc.nextLine();

System.out.println("Descrição do produto:");
	   descricao = sc.nextLine();

System.out.println("Categoria do produto:");
	   categoria = sc.nextLine();

System.out.println("Preço do produto:");
	   preco = sc.nextDouble();
	     sc.nextLine();
	       
System.out.println("Peso do produto:");
	   peso = sc.nextDouble();
	     sc.nextLine();
  
System.out.println("Informe o fabricante do produto:");
	    fabricante = sc.nextLine();
	        
Produto novoProduto = new Produto(id, codBarras, sku, nome, descricao, categoria,preco, peso, fabricante);
	    produtos.add(novoProduto);
  
System.out.println("Produto incluído com sucesso!");
	      sc.close();
	    }

public void AlterarProd() {
	    	
Scanner sc = new Scanner(System.in);
	    
int id, idAlt;
String novoCodBarras, novaDescricao, novoSku, novoNome, novaCategoria, novoFabricante;
double novoPreco, novoPeso;
	       
System.out.println("Informe o ID do produto que deseja alterar:");
	  dAlt = sc.nextInt();
	       
Produto produtoExiste = null; 
	    for(Produto produto : produtos)
	       {
	    	   if(produto.getId()==idAlt)
	    	   {
	    		   produtoExiste = produto;
	    				   break;
	    	  }
	    }
  if (produtoExiste != null)
	       {
System.out.println("Entre com o novo nome: ");
	    novoNome = sc.next();
	    	   
System.out.println("Entre com o novo código de barras: ");
	    novoCodBarras = sc.next();
	    	   
System.out.println("Entre com o novo sku: ");
	    novoSku = sc.next();
	    	   
System.out.println("Entre com a descrição: ");
	    novaDescricao = sc.next();
	    	   
System.out.println("Entre com a nova categoria: ");
	    novaCategoria = sc.next();
	    	   
System.out.println("Entre com o novo fabricante: ");
	    novoFabricante = sc.next();
	    	   
System.out.println("Entre com o novo preço: ");
	  novoPreco = sc.nextDouble();
	    sc.next();
	    	   
System.out.println("Entre com o novo peso: ");
	    novoPeso = sc.nextDouble();
	    	   
Produto novoProduto = new Produto(idAlt, novoCodBarras, novoSku, novoNome,
	    novaDescricao, novaCategoria, novoPreco, novoPeso, novoFabricante);
	    	   
produtos.remove(produtoExiste);
produtos.add(novoProduto);
	    	   
System.out.println("Produto alterado!");
	    	   
}
else{
	    	System.out.println("Produto não encontrado");
	       }
}
	
public void AlterarProd() {
	    	
Scanner sc = new Scanner(System.in);
	    
int id, idAlt;
String novoCodBarras, novaDescricao, novoSku, novoNome, novaCategoria, novoFabricante;
double novoPreco, novoPeso;
	       
System.out.println("Informe o ID do produto que deseja alterar:");
	idAlt = sc.nextInt();
	       
Produto produtoExiste = null;
	       
for(Produto produto : produtos)
	{
	 if(produto.getId()==idAlt)
	    	{
	    	produtoExiste = produto;
	    	break;
	    	}
}
if (produtoExiste != null)
	{
System.out.println("Entre com o novo nome: ");
	novoNome = sc.next();
		    	   
System.out.println("Entre com o novo código de barras: ");
	novoCodBarras = sc.next();
		    	   
System.out.println("Entre com o novo sku: ");
	novoSku = sc.next();
		    	   
System.out.println("Entre com a descrição: ");
	novaDescricao = sc.next();
		    	   
System.out.println("Entre com a nova categoria: ");
	novaCategoria = sc.next();
		    	   
System.out.println("Entre com o novo fabricante: ");
	novoFabricante = sc.next();
		    	   
System.out.println("Entre com o novo preço: ");
	novoPreco = sc.nextDouble();
		sc.next();
		    	   
System.out.println("Entre com o novo peso: ");
	novoPeso = sc.nextDouble();
		    	   
Produto novoProduto = new Produto(idAlt, novoCodBarras, novoSku, novoNome,novaDescricao, novaCategoria, novoPreco, novoPeso, novoFabricante);

produtos.remove(produtoExiste);
produtos.add(novoProduto);
		    	   
System.out.println("Produto alterado!");
		    	   
}
else
{
System.out.println("Produto não encontrado");
	}
}

