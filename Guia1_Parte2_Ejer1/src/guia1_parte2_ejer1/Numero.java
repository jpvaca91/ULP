
package guia1_parte2_ejer1;


public class Numero {
    private int num;
    
    
    public Numero(int num){
        this.num=num;
        
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public boolean esPar(){
        
        return this.num % 2==0;
                
    }
    public boolean esPositivo(){
        return this.num >=0;
    }
    
    public boolean esMultiplo(){
        return this.num % 3==0;
    }
}
