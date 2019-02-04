package Usuario;

public class UserService {
    public String login(ILoginUsuario ILoginUsuario) {
        String resultado = ILoginUsuario.getName() + ILoginUsuario.getPassword();
        return resultado;
    }

    public boolean enviarPaqueteAsuCasa(IUsuarioEnviarPaquete IUsuarioEnviarPaquete) {

        String resultado = IUsuarioEnviarPaquete.getDirecion() + IUsuarioEnviarPaquete.getClasePaquete();
        if (resultado != "") {
            return true;
        }
        else {
            return false;
        }

    }

    public boolean enviarFactura(IUsuarioEnviarFactura IUsuarioEnviarFactura) {

        String resultado = IUsuarioEnviarFactura.getDirecion() + IUsuarioEnviarFactura.getCodigoFactura();
        if (resultado != "") {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean enviarEmail(IUsuarioEmail IUsuarioEmail) {

        String resultado = IUsuarioEmail.getEmail();
        if (resultado != "") {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean crearSombreroPersonalizado(IUsuarioSombrero IUsuarioSombrero) {

        String resultado = IUsuarioSombrero.getMedidasCabeza() + IUsuarioSombrero.getCaracteristicas();
        if (resultado != "") {
            return true;
        }
        else {
            return false;
        }
    }
}
