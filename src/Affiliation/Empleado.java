package Affiliation;

import Empleadores.Empleadores;

/**
 *
 * @author jse
 */
public class Empleado extends Afiliado {

    public String sector;
    public String Empleador;
    public Double sueldo;
    public String Cargo;

    public Empleado(String Nombre, String Nacionalidad, String Genero, int edad) {
        super(Nombre, Nacionalidad, Genero, edad);
    }

    public Empleado() {
        super("","","",0);
    }

    public double Cotizacion(double sueldo) {
        return sueldo * 0.0725;
    }
    
    /**
     *
     * @param cargo
     * El cargo que desempeña el empleado
     * 
     * @param patron
     * El objeto empleadores que representa el jefe del empleado
     * 
     * @param sueldo
     * 
     * El sueldo devengado
     */
    public void LLenarDatos(String cargo,Empleadores patron, double sueldo){
        this.Cargo = cargo;
        this.Empleador = patron.RazonSocial;
        this.sector = patron.Sector;
        this.sueldo=sueldo;
    }
}
