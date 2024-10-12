package exercicio_1;

public class MainEstoque {
    public static void main(String[] args) {
        ControleEstoque controleEstoque = new ControleEstoque();

        Produto produto1 = ...
        Produto produto2 = ...
        Produto produto3 = ...

        try {
            System.out.println("Adicionando...");
            controleEstoque.adicionar(produto1);
            controleEstoque.adicionar(produto2);
            controleEstoque.adicionar(produto3);
            System.out.prinyln("3 produtos adicionados.");

            System.out.println("Removendo...");
            controleEstoque.remover(?);
            controleEstoque.remover(?);
            System.out.println("1 produto removido.");
        } catch (ProdutoNaoEncontradoException e) {
            System.out.println(e.getMessage());
            
        }

}
