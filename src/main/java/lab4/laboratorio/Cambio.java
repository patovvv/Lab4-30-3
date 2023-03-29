
package lab4.laboratorio;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Cambio {    
    public void CamDatos(Supermercado a){
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner leer = new Scanner(System.in);
        
        List<String> Dias;
        Dias=new ArrayList<>();
        Dias.add("Lunes ");
        Dias.add("Martes ");
        Dias.add("Miercoles ");
        Dias.add("Jueves ");
        Dias.add("Viernes ");
        Dias.add("Sabado ");
        Dias.add("Domingo ");
        
        HashMap <String,Float> ventasDay=new HashMap<>();
        System.out.println("\n- - - - - - - - - - - - ");
        System.out.println("Ingrese nombre supermercado: ");
        a.setNombre(leer.next());
        
        System.out.println("Ingrese nombre del gerente: ");
        a.setNombreG(leer.next());
        
        System.out.println("Ingrese el codigo:");
        a.setCodigo(leer.nextInt());
        
        System.out.println(" - - - - - - - - - - - - - ");
       
        for(int i=0;i<=6;i=i+1){
            System.out.println("Ingrese cantidad de ventas del dia "+Dias.get(i));        
            ventasDay.put(Dias.get(i),leer.nextFloat());
            a.setVntsWeek(a.getVntsWeek()+ventasDay.get(Dias.get(i)));     
        }
        
        
        //Reporte del Supermercado
        System.out.println("- - - - - - - - - - -");
        System.out.println("Reporte del supermercado "+ a.getNombre());
        System.out.println("-Gerente: "+ a.getNombreG());
        System.out.println("-Codigo: "+ a.getCodigo());
        System.out.println("-El total que vendio en la semana fue de: "+ a.getVntsWeek());
       
        for(int i=0;i<=6;i=i+1){
            HashMap <String,Float> vSem=new HashMap<>();
            float abc=((ventasDay.get(Dias.get(i))*100)/a.getVntsWeek());
            vSem.put(Dias.get(i),abc); 
            System.out.println("El dia "+Dias.get(i)+"vendio un porcentaje: "+df.format(abc)+"% del total de ventas de la semana"); 
            
            
        } 
    }   
    
    public void PorcVentWeek(Supermercado a,Supermercado b,Supermercado c){ 
        DecimalFormat df = new DecimalFormat("#.00");
        float totalv= a.getVntsWeek()+b.getVntsWeek()+c.getVntsWeek();
        a.setPorcVentWeek((a.getVntsWeek()*100)/totalv);
        b.setPorcVentWeek((b.getVntsWeek()*100)/totalv);
        c.setPorcVentWeek((c.getVntsWeek()*100)/totalv); 
        System.out.println("\n\n- - - - - - - - - - - - - - - - " );
        System.out.println("El total de ventas de la semana de los tres supermercados es: "+totalv);
        System.out.println(a.getNombre()+" vendio " + a.getVntsWeek() +" que corresponde al "+df.format(a.getPorcVentWeek())+"% del total semanal");
        System.out.println(b.getNombre()+" vendio " + b.getVntsWeek() +" que corresponde al "+df.format(b.getPorcVentWeek())+"% del total semanal");
        System.out.println(c.getNombre()+" vendio " + c.getVntsWeek() +" que corresponde al "+df.format(c.getPorcVentWeek())+"% del total semanal\n");
    }       
   
    public void MenosVentas(Supermercado super1, Supermercado super2, Supermercado super3){
        
        if ((super1.getVntsWeek()< super2.getVntsWeek()) && (super1.getVntsWeek()<super3.getVntsWeek())){
            System.out.println("El supermercado " + super1.getNombre() + " fue el que menos vendio");}
        
        if ((super2.getVntsWeek()< super1.getVntsWeek()) && (super2.getVntsWeek()<super3.getVntsWeek())){
            System.out.println("El supermercado " + super2.getNombre() + " fue el que menos vendio");}
        
        if ((super3.getVntsWeek()< super2.getVntsWeek()) && (super3.getVntsWeek()<super1.getVntsWeek())){
            System.out.println("El supermercado " + super3.getNombre() + " fue el que menos vendio");}
        
        System.out.println("- - - - - - - - - - - ");
    }






}




