import java.util.List;

public class Lanchonete {
private static final Lanche[] Itens = null;
private List<Lanche> pedidos;
public void listarItens () {
    for (Lanche l : Itens) {
        System.out.println(Itens);
} 
public void listarPedidos () {
    for (Lanche l : pedidos) {
        System.out.println(l.Pedidos());
}
protected Object fazerPedido;
public static Lanche[] getItens() {
    return Itens;
}
public List<Lanche> getPedidos() {
    return pedidos;
}
public void setPedidos(List<Lanche> pedidos) {
    this.pedidos = pedidos;
}
public Object getFazerPedido() {
    return fazerPedido;
}
public void setFazerPedido(Object fazerPedido) {
    this.fazerPedido = fazerPedido;
}
 
}
}

