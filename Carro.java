public class Carro extends Vehiculo{    
    public Carro(){}    
    public Carro(String p, String m, String c,int v){
        super(p,m,c,v);
    }
    public Carro(String p, String m, String c){
        super(p,m,c);
    } 
    public String tipoVehiculo(Carro c1){
        return "Es un carro";
    }
}
