package Usuario;

public class Usuario implements ILoginUsuario, IUsuarioEnviarPaquete, IUsuarioEnviarFactura, IUsuarioEmail, IUsuarioSombrero {

    String name;
    String password;
    String direcion;
    String clasePaquete;
    String codigoFactura;
    String email;
    String medidasCabeza;
    String caracteristicas;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setClasePaquete(String clasePaquete) {
        this.clasePaquete = clasePaquete;
    }

    public String getClasePaquete() {
        return clasePaquete;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMedidasCabeza(String medidasCabeza) {
        this.medidasCabeza = medidasCabeza;
    }

    public String getMedidasCabeza() {
        return medidasCabeza;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
}
