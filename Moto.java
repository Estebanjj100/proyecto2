public class Moto extends Vehiculo{
    /**
     *
     */
    public Moto(){}
    public Moto(String p, String m, String c,int v){
        super(p,m,c,v);
    }
    public Moto(String p, String m, String c){
        super(p,m,c);
    }
    public String tipoVehiculo(Moto m1){
        return "Es una moto";
    }
    public String getClase(){
        return "Moto";
    }
}