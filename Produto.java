import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private int id;
    private String codigoBarras;
    private String sku;
    private String nome;
    private String descricao;
    private String categoria;
    private double preco;
    private double peso;
    private String fabricante;

    

    public Produto(int id, String codigoBarras, String sku, String nome, String descricao, String categoria, double preco, double peso, String fabricante) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.sku = sku;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.peso = peso;
        this.fabricante = fabricante;

        public String toString() {
        return "ID: " + id + ", Código de Barras: " + codigoBarras + ", SKU: " + sku + ", Nome: " + nome + ", Descrição: " + descricao + ", Categoria: " + categoria + ", Preço: " + preco + ", Peso: " + peso + ", Fabricante: " + fabricante;
    }
}

