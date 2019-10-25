
package ejercicio45_oniet;

/**
 *
 * @author Adriana
 */
import java.math.BigInteger;


public class CompraVenta {
    // atributos
    int idUsuario;
    String idDispositivo;
    String ip;
    BigInteger dni;
    BigInteger tarjeta;
    
    // constructores

    public CompraVenta(int idUsuario, String idDispositivo, String ip, BigInteger dni, BigInteger tarjeta) {
        this.idUsuario = idUsuario;
        this.idDispositivo = idDispositivo;
        this.ip = ip;
        this.dni = dni;
        this.tarjeta = tarjeta;
    }
    public CompraVenta(String idDispositivo, String ip, BigInteger dni, BigInteger tarjeta) {
        this.idUsuario = 0;
        this.idDispositivo = idDispositivo;
        this.ip = ip;
        this.dni = dni;
        this.tarjeta = tarjeta;
    }
    public CompraVenta(int idUsuario, String ip, BigInteger dni, BigInteger tarjeta) {
        this.idUsuario = idUsuario;
        this.idDispositivo = "";
        this.ip = ip;
        this.dni = dni;
        this.tarjeta = tarjeta;
    }
    
}