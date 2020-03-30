package Empleadores;

import Affiliation.Empleado;

/**
 *
 * @author jse
 */
public class Empleadores {

    public String Sector;
    public String RazonSocial;

    public Empleadores() {
    }

    public Empleadores(String Sector, String RazonSocial, Empleado empleado) {
        this.Sector = Sector;
        this.RazonSocial = RazonSocial;
    }

    //El 0.85% de lo que aporta el empleador queda en la cuenta del empleado
    public double aportarTrabajador(Empleado empleado){
        return empleado.sueldo*0.0085;
    }
    
    public String enviarPlanilla(Empleado empleado) {
        return empleado.Nombre + " con sueldo "
                + empleado.sueldo + " cotiza "
                + empleado.Cotizacion(empleado.sueldo);
    }

}
