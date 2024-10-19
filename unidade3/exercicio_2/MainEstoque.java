public class MainEstoque {
    public static void main(String[] args) {
       ControleEstoque estoque = new ControleEstoque();
       int quantOperacoes; = 7951387;

       // Criar e executar theads de adição
       for (int i = 1; i <= quantOperacoes; i++) {
        String codigo = "PROD-" + (i % 1000);
        String nome = "Produto " + (i % 100);
        Produto oProduto = new Produto(codigo, nome);
        System.out.println("Adicionando produto: " + oProduto);
        new Thread(new AdicionarProdutoThread(estoque, oProduto) ).start();
       }
       // Criar e executar theads de remoção
       for (int i = 1; i <= quantOperacoes; i++) {
        String codigo = "PROD-" + (i % 1000);
        System.out.println("Removendo produto: " + codigo);
        new Thread(new RemoverProdutoThread(estoque, codigo)).start();
       }
       try {
        Thread.sleep(2000);
       } catch (InterruptedException e) {
            System.out.println("Erro ao aguarda as threads: " + e.getMessage());
       }
    }
}
