
package guia5_parte2_ejer1;


public class Guia5_Parte2_Ejer1 {

   
    public static void main(String[] args) {
        DirectorioTelefonico direc = new DirectorioTelefonico();
        
        Cliente client = new Cliente(32479707,"valeria", "Monzon","lanus","iberlucea 3089");
        Cliente client1 = new Cliente(23567607,"sabri", "choque","quilmes","sanabria 20899");
        Cliente client2= new Cliente(32455607,"enzo", "Bulacio","sur","iberlucea 8589");
        Cliente client3= new Cliente(324734407,"renato", "brandan","lanus","iberlucea 4589");
        Cliente client4= new Cliente(324733307,"alverto", "efrain","lanus","iberluc 5089");
        
        direc.agregarCliente("1234", client);
        direc.agregarCliente("1534", client1);
        direc.agregarCliente("1564", client2);
        direc.agregarCliente("12674", client3);
        direc.agregarCliente("1456", client4);
        direc.buscarCliente("lanus");
        
        direc.buscarClientePorTelefono("1234");
    }

}
