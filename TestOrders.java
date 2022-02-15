public class TestOrders {
    public static void main(String[] args) {

        Item articulo1 = new Item("Moka", 4.3);
        Item articulo2 = new Item("Latte", 4.1);
        Item articulo3 = new Item("Café de goteo", 4.0);
        Item articulo4 = new Item("Capuchino", 4.2);

        Order pedido1 = new Order();
        Order pedido2 = new Order();

        Order pedido3 = new Order("Mitch");
        Order pedido4 = new Order("Nina");
        Order pedido5 = new Order("Nami");

        pedido1.addItem(articulo1);
        pedido1.addItem(articulo2);
        pedido1.addItem(articulo3);

        pedido2.addItem(articulo2);
        pedido2.addItem(articulo3);
        pedido2.addItem(articulo4);

        pedido3.addItem(articulo3);
        pedido3.addItem(articulo4);
        pedido3.addItem(articulo1);

        pedido4.addItem(articulo4);
        pedido4.addItem(articulo1);
        pedido4.addItem(articulo2);

        pedido5.addItem(articulo1);
        pedido5.addItem(articulo2);
        pedido5.addItem(articulo3);

        pedido1.display();
        pedido2.display();
        pedido3.display();
        pedido4.display();
        pedido5.display();

        pedido5.setIsReady(true);
        pedido1.setIsReady(true);

        System.out.println(pedido5.getStatusMessage());
        System.out.println(pedido1.getStatusMessage());

    }
}