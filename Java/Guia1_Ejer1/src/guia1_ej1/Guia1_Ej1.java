

package guia1_ej1;


public class Guia1_Ej1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto cafe=new Producto(423,"Un cafe rico y caraso",4500,2);
        Producto celular=new Producto(422,"Celular caro",255000.99,22);
        //System.out.println("El codigo es "+celular.getCodigo());
        //System.out.println("La descripcion es "+celular.getDescripcion());
    celular.mostrar();
    cafe.mostrar();  
    
    
    }

}
