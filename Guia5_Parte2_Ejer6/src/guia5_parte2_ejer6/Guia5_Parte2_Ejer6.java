
package guia5_parte2_ejer6;


public class Guia5_Parte2_Ejer6 {

   
    public static void main(String[] args) {
         Catalogo catalogo = new Catalogo();
        
        Producto ropa1 = new Ropa('A', 468713, "Remera", "Adidas", 5200, 123);
        Producto ropa2 = new Ropa('B', 231775, "Pantalon", "Nike", 9400, 90);
        Producto electro1 = new Electro(120, 65897546, "Heladera", "PinPon", 351000, 5);
        Producto electro2 = new Electro(12, 74323, "Notebook", "AMD", 640000, 3);
        Producto perfu1 = new Perfume(85, 354672, "Perfume 1", "Stone", 7000, 54);
        Producto perfu2 = new Perfume(120, 89754, "Perfume 2", "Avon", 5000, 70);
        
        catalogo.agregarProducto(ropa1);
        catalogo.agregarProducto(ropa2);
        catalogo.agregarProducto(electro1);
        catalogo.agregarProducto(electro2);
        catalogo.agregarProducto(perfu1);
        catalogo.agregarProducto(perfu2);
        
        catalogo.informeProductos();
        
        catalogo.listarElectro();
        catalogo.listarRopa();
        catalogo.listarPerfumeria();
    }

}
