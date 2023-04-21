/**
 *
 * @author Eliazar Alonso Santana
 */

public class Socios {
    private String nombre;
    private String correo;
    private String direccion;
    private double saldoTarjeta;

    /**
     *
     * @param nombre
     * @param correo
     * @param direccion
     * @param saldoTarjeta
     */
    public Socios(String nombre, String correo, String direccion, double saldoTarjeta){
        this.nombre=nombre;
        this.correo=correo;
        this.direccion=direccion;
        this.saldoTarjeta=saldoTarjeta;
    }

    /**
     * dado el importe se mira si tiene saldo suficiente y se le resta
     * @param importe
     */
    public boolean comprarArticulos(double importe){
        if (this.saldoTarjeta>=importe){
            this.saldoTarjeta-=importe;
            return true;
        }else {
            return false;
        }
    }
}
