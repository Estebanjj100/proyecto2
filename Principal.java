import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author User
 */
public class Principal {
        /**
         * @param args the command line arguments
         * @throws java.io.IOException
         */
        public static void main(String[] args) throws IOException {
            mostrarMenu();
        }
        public static void mostrarMenu()throws IOException{
            Scanner scan = new Scanner(System.in);
            Sensor s = new Sensor();
            //Vehiculo v=new Vehiculo(); 
            System.out.println("Ingrese el numero de celdas que tiene el parqueadero");
            int n = scan.nextInt();
            System.out.println("Ingrese el precio por hora del parqueadero");
            System.out.println("Ingrese el precio para carros");
            double preciocarros = scan.nextInt();
            System.out.println("Ingrese el precio para motos");
            double preciomotos = scan.nextInt();
            Sensor.sensores = new Sensor[n];
            s.setSensores(Sensor.sensores);
            Vehiculo.parq= new Vehiculo[n];
            int x=1;
            while(x!=0){
                System.out.println(" 1 para imprimir sensores libres  ");
                System.out.println(" 2 solicitar espacio de parqueo cuando no sabe valor comercial");
                System.out.println(" 3 solicitar espacio de parqueo cuando sabe valor comercial");
                System.out.println(" 4 para obtener la info del todos los vehiculos almacenados");
                System.out.println(" 5 historial de vehiculos");
                System.out.println(" 6 estado de un sensor");
                System.out.println(" 7 todos los sensores");
                System.out.println(" 8 todos los vehiculosde un color particular");
                System.out.println(" 9 vehiculos ordenados por valor comercial");
                System.out.println(" 10 para desactivar manualmente un sensor especifico");
                System.out.println(" 11 para tener la informacion de todos los vehiculos parqueados");
                System.out.println(" 0 para terminar ");
                System.out.println(" Digite la opcion deseada");
                x = scan.nextInt();
                switch(x){
                    case 1:
                       //String sen = s.sensorLibre(); 
                       String sen = Sensor.sensorLibre(); 
                       System.out.println(sen);
                       break;
                    case 2:
                        System.out.println("Ingrese el numero de la celda");
                        int pos = scan.nextInt();
                        if(Vehiculo.parq[pos] != null)
                        {
                            System.out.println("Este espacio esta ocupado");
                        }
                        else
                        {   
                            System.out.println("Ingrese el tipo de vehiculo que va a parquear");
                            String tipovehiculo = scan.next();
                            System.out.println("Ingrese placa de su vehiculo");
                            String placa = scan.next();
                            System.out.println("Ingrese marca de su vehiculo");
                            String marca = scan.next();
                            System.out.println("Ingrese color de su vehiculo");
                            String color = scan.next();
                            if(tipovehiculo.equals("carro")||tipovehiculo.equals("Carro")||tipovehiculo.equals("CARRO")){
                                Carro c1;
                                c1 = new Carro(placa,marca,color);
                                Vehiculo.parq[pos]=c1;
                                Sensor s1;
                                s1 = new Sensor();
                                s1.setEstado(1);
                                Sensor.sensores[pos]=s1;
                                Vehiculo.cantidad++;
                                System.out.println("la informacion del vehiculo es " + c1.toString()+" "+ c1.tipoVehiculo(c1));  
                            }
                            else{
                                Moto m1;
                                m1 = new Moto(placa,marca,color);
                                Vehiculo.parq[pos]=m1;
                                Sensor s1;
                                s1 = new Sensor();
                                s1.setEstado(1);
                                Sensor.sensores[pos]=s1;
                                Vehiculo.cantidad++;
                                System.out.println("la informacion del vehiculo es " + m1.toString()+" "+m1.tipoVehiculo(m1));  
                            }                       
                        }
                        break;
                    case 3:               
                        System.out.println("Ingrese el numero de la celda");
                        int posicion = scan.nextInt();
                        if(Vehiculo.parq[posicion] != null)
                        {
                            System.out.println("Este espacio esta ocupado");
                        } 
                        else
                        {
                            System.out.println("Ingrese el tipo de vehiculo");
                            String tipovehiculo = scan.next();
                            System.out.println("Ingrese placa de su vehiculo");
                            String placa = scan.next();
                            System.out.println("Ingrese marca de su vehiculo");
                            String marca = scan.next();
                            System.out.println("Ingrese color de su vehiculo");
                            String color = scan.next();
                            System.out.println("Ingrese valor comercial de su vehiculo");
                            int valor = scan.nextInt();
                            if(tipovehiculo.equals("carro")||tipovehiculo.equals("Carro")||tipovehiculo.equals("CARRO")){
                                Carro c1;
                                c1 = new Carro(placa,marca,color,valor);
                                Vehiculo.parq[posicion]=c1;
                                Sensor s1;
                                s1 = new Sensor();
                                s1.setEstado(1);
                                Sensor.sensores[posicion]=s1;
                                Vehiculo.cantidad++;
                                System.out.println("la informacion del vehiculo es " + c1.toString());  
                            }
                            else{
                                Moto m1;
                                m1 = new Moto(placa,marca,color,valor);
                                Vehiculo.parq[posicion]=m1;
                                Sensor s1;
                                s1 = new Sensor();
                                s1.setEstado(1);
                                Sensor.sensores[posicion]=s1;
                                Vehiculo.cantidad++;
                                System.out.println("la informacion del vehiculo es " + m1.toString());  
                            }                       
                        }
                        break;
                    case 4:
                
                        System.out.println( Vehiculo.toStringVehiculos());
                        break;
                    case 5:
                
                        System.out.println("La cantidad de vehiculos en el parqueadero es de  " + Vehiculo.cantidad);
                        break;
                    case 6:
                
                        System.out.println("Digite numero del espacio ");
                        int espa = scan.nextInt();
                        System.out.println(Sensor.sensores[espa].toString());
                        break;
                    case 7:                
                        System.out.println(Sensor.sensoresEstado());
                        break;
                    case 8:                
                        System.out.println("Ingrese el color de su vehiculo");
                        String colr = scan.next();
                        String coloresiguales ="";                    
                        for (int i=0;i<Sensor.sensores.length;i++) {
                            if ( Vehiculo.parq[i]!=null && colr.equals(Vehiculo.parq[i].getColor())) {
                                coloresiguales += Vehiculo.parq[i].toString();
                                System.out.println("encontro uno igual color :>");
                            } 
                        }
                        System.out.println(coloresiguales);
                        break;
                    case 9:                        
                        for(int i=0;i<Vehiculo.parq.length;i++){
                            if(Vehiculo.parq[i]==null){
                                Vehiculo v3 = new Vehiculo( "","" ,"" ,0);
                                Vehiculo.parq[i]=v3;
                            }
                        }
                        Vehiculo aux = new Vehiculo();
                        for(int i =0;i<Vehiculo.parq.length;i++){
                            for(int j=i+1;j<Vehiculo.parq.length;j++){
                                    if(Vehiculo.parq[i].getvalorComercial() > Vehiculo.parq[j].getvalorComercial()){
                                        aux = Vehiculo.parq[j];
                                        Vehiculo.parq[j]=Vehiculo.parq[i];
                                        Vehiculo.parq[i]=aux;
                                    }
                            }
                        }
                        for (Vehiculo parq1 : Vehiculo.parq) {
                            System.out.println(parq1.toString());
                        }
                        for(int i=0;i<Vehiculo.parq.length;i++){
                            if(Vehiculo.parq[i].getvalorComercial()==0){
                                Vehiculo.parq[i]=null;
                            }
                        }
                        break;
                    case 10:
                        double apagar;
                            System.out.println("Digite el sensor que desea desocupar");
                            int desact = scan.nextInt();
                            if(Sensor.sensores[desact]!=null){
                                    Vehiculo.parq[desact].setHorasalida();
                                    Duration duration = Duration.between(Vehiculo.parq[desact].getHoraentrada(), Vehiculo.parq[desact].getHorasalida());
                                    double diff = Math.abs(duration.toMinutes());
                                    if(Vehiculo.parq[desact] instanceof Carro){
                                       apagar = diff*(preciocarros/60);
                                    } else {
                                       apagar = diff*(preciomotos/60);
                                    }
                                    System.out.println("El valor a pagar es:  "+ apagar);
                                    Vehiculo.parq[desact] = null;
                                    Vehiculo.cantidad--;
                            } else{
                                System.out.println("No hay ningun vehiculo parqueado en este sensor");
                            }  
                        break;
                    case 11:
                            String text = " ";
                            for(int i=0;i<Vehiculo.parq.length;i++){
                                if(Vehiculo.parq[i]!=null){
                                    text += Vehiculo.parq[i].toString();
                                }
                            }
                            File file = new File("FicheroVehiculosparqueados.txt");
                            FileWriter fw = new FileWriter(file.getAbsoluteFile());
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(text);
                            bw.close();
                        break;
                    default:
                        System.out.println("Comando incorrecto");
                        break;
                }                
            }
        }
}