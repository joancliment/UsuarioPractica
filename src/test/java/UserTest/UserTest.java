package UserTest;

import Usuario.Usuario;
import Usuario.UserHandler;
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
        Usuario user1 = handler.usuario;
        Assert.assertNotEquals(user1, null);
    }

    @Test
    public void Login_usuario_correcto () {
        Usuario user2 = new Usuario ();
        String expected = "1234";
        String actual = user2.Login("1234");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void enviaPaqueteAsucasa_correcto () {
        Usuario user3 = new Usuario ();
        String expected = "llega_19:00_direccion";
        String actual = user3.EnviaPaqueteAsuCasa("llega_19:00_direccion");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void enviarFactura_correcto () {
        Usuario user4 = new Usuario ();
        String expected = "envia_Fact_19.00_direccion";
        String actual = user4.EnviarFactura("envia_Fact_19.00_direccion");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void enviarMail_correcto () {
        Usuario user5 = new Usuario ();
        String expected = "mail@gmail.com";
        String actual = user5.EnviarMail("mail@gmail.com");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crearUnSombreroPersonalizado_correcto () {
        Usuario user5 = new Usuario ();
        String expected = "sombrero_talla_30";
        String actual = user5.crearUnSombreroPersonalizado("sombrero_talla_30");
        Assert.assertEquals(expected, actual);
    }

}
