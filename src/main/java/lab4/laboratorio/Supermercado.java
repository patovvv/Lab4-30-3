package lab4.laboratorio;

public class Supermercado{
    //Atributos
    private String nombre;
    private String nombreG;
    private int codigo;
    private float vntsWeek;
    private float porcVentWeek;
   
    //Constructor
    public Supermercado(String nombre, String nombreG,int codigo, float vntsWeek, float porcVentWeek){
    this.nombre=nombre;
    this.nombreG=nombreG;
    this.porcVentWeek=porcVentWeek;
    this.codigo=codigo;
    this.vntsWeek=vntsWeek;  
    }
    
    //Sobrecarga constructor
    public Supermercado(){}
        
    //Gets 
    public String getNombre() {
        return nombre;
    }
    public String getNombreG() {
        return nombreG;
    }
    public int getCodigo() {
        return codigo;
    }
    public float getVntsWeek() {
        return vntsWeek;
    }
    public float getPorcVentWeek() {
        return porcVentWeek;
    }
    
    
    //Sets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNombreG(String nombreG) {
        this.nombreG = nombreG;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setVntsWeek(float vntsWeek) {
        this.vntsWeek = vntsWeek;
    }  
    public void setPorcVentWeek(float porcVentWeek) {
        this.porcVentWeek = porcVentWeek;
    }      
}
    
    