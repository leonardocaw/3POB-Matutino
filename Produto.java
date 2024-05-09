package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
private int id;
private String codigoB;
private String sku;
private String nome;
private String descricao;
private String categoria;
private double preco;
private double peso;
private String fabricante;

public Produto(int id, String codigoB, String sku, String nome, String descricao, String categoria, double preco, double peso, String fabricante) {

this.id = id;
this.codigoB = codigoB;
this.sku = sku;
this.nome = nome;
this.descricao = descricao;
this.categoria = categoria;
this.preco = preco;
this.peso = peso;
this.fabricante = fabricante;

public String toString(){
	return "ID: " + id + ", Código de Barras: " + codigoB + ", SKU: " + sku + ", Nome: " + nome + ", Descrição: " + descricao + ", Categoria: " + categoria + ", Preço: " + preco + ", Peso: " + peso + ", Fabricante: " + fabricante;
    }
}

public int getId() {
	return id;
}

public String getCodigoB() {
	return codBarras;
}

public String getSku() {
	return sku;
}

public String getNome() {
	return nome;
}

public String getDescricao() {
	return descricao;
}

public String getCategoria() {
	return categoria;
}

public double getPreco() {
	return preco;
}

public double getPeso() {
	return peso;
}

public String getFabricante() {
	return fabricante;
}

public void setId(int id) {
	this.id = id;
}

public void setCodBarras(String codBarras) {
	this.codBarras = codBarras;
}

public void setSku(String sku) {
	this.sku = sku;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}

}
