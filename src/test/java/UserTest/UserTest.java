package UserTest;

import Usuario.UserHandler;
import Usuario.UserService;
import Usuario.Usuario;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {

    @Test //accion / clase / valor esperado
    public void Existe_Usuario_Existe (){
        Usuario user = new Usuario ();
        Assert.assertNotEquals(user, null);
    }

    @Test
    public void Creamos_Usuario_enClase_externa () {
        UserHandler handler = new UserHandler();
        Usuario usuario = handler.usuario;
        Assert.assertNotEquals(usuario, null);
    }

    @Test
    public void Login_usuario_correcto () {

        UserService userservice = new UserService();

        Usuario usuario = new Usuario();
        usuario.setName("joan");
        usuario.setPassword("1234");

        String actual = userservice.login(usuario);
        String expected = "joan1234";
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void Enviar_paquete_a_sucasa_correcto() {

        UserService userservice = new UserService();

        Usuario usuario = new Usuario();
        usuario.setDirecion("Casp 5 1");
        usuario.setClasePaquete("DVD Big Bang Theory");
        boolean actual = userservice.enviarPaqueteAsuCasa(usuario);
        boolean expected = true;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void enviar_Factura_Correcto () {

        UserService userservice = new UserService();

        Usuario usuario = new Usuario();
        usuario.setDirecion("Casp 5 1");
        usuario.setCodigoFactura("11111");
        boolean actual = userservice.enviarFactura(usuario);
        boolean expected = true;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void enviar_Email_Correcto () {

        UserService userservice = new UserService();

        Usuario usuario = new Usuario();
        usuario.setEmail("mail@gmail.com");
        boolean actual = userservice.enviarEmail(usuario);
        boolean expected = true;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void crear_Sombrero_Correcto () {

        UserService userservice = new UserService();

        Usuario usuario = new Usuario();
        usuario.setMedidasCabeza("44,45");
        usuario.setCaracteristicas("blanco, copa");
        boolean actual = userservice.crearSombreroPersonalizado(usuario);
        boolean expected = true;
        Assert.assertEquals(actual, expected);

    }

}
