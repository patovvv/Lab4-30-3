package lab4.laboratorio;


//Integrantes: Patricio Vargas , Fabiola Level

public class Laboratorio4 {
    public static void main(String[] args){        
        Supermercado super1 = new Supermercado();
        Supermercado super2 = new Supermercado();
        Supermercado super3 = new Supermercado();
        Cambio cambio = new Cambio();

        cambio.CamDatos(super1);
        cambio.CamDatos(super2);
        cambio.CamDatos(super3);
        
        cambio.PorcVentWeek(super1,super2,super3);
        
        cambio.MenosVentas(super1, super2, super3);
    }
}
