
package guia1_ej1;


public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    
    public Producto(int codigo,String descripcion,double precio,int stock){
    this.codigo=codigo;
    this.descripcion=descripcion;
    this.precio=precio;
    this.stock=stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void mostrar(){
        System.out.println("El codigo es "+codigo+", la descripcion es: "+descripcion+
                ". El precio es de "+precio+", y me quedan "+stock+" en stock.");
    }
    
}
