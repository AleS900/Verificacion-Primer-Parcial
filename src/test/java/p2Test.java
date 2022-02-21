import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import firstTest.p2.PermisoUtils;
import firstTest.p2.UserUtils;
import firstTest.p2.Permisos;
import org.mockito.Mockito;

public class p2Test {
    PermisoUtils permisoMock = Mockito.mock(PermisoUtils.class);
    UserUtils userMock = Mockito.mock(UserUtils.class);

    @Test
    public void verifyUserPermission(){
        Mockito.when(userMock.getCorrectUser("AleS")).thenReturn(true);
        Mockito.when(permisoMock.getPermission("C")).thenReturn("C");
        Permisos permisos = new Permisos(userMock,permisoMock);
        String actualResult = permisos.permisos("AleS","C");
        String expectedResult = "C 21/02/22";
        Assertions.assertTrue(actualResult.contains(expectedResult),"");
        //Mockito.verify(userMock).getCorrectUser("AleS");
        //Mockito.verify((permisoMock).getPermission("C"));
    }

    @Test
    public void verifyUserPermission2(){
        Mockito.when(userMock.getCorrectUser("AleS")).thenReturn(true);
        Mockito.when(permisoMock.getPermission("C")).thenReturn("CRUD");
        Permisos permisos = new Permisos(userMock,permisoMock);
        String actualResult = permisos.permisos("AleS","CRUD");
        String expectedResult = "CRUD 21/02/22";
        Assertions.assertTrue(actualResult.contains(expectedResult),"");
        //Mockito.verify(userMock).getCorrectUser("AleS");
        //Mockito.verify((permisoMock).getPermission("C"));
    }

    @Test
    public void verifyUserPermission3(){
        Mockito.when(userMock.getCorrectUser("AleS")).thenReturn(false);
        Mockito.when(permisoMock.getPermission("C")).thenReturn("C");
        Permisos permisos = new Permisos(userMock,permisoMock);
        String actualResult = permisos.permisos("AleS","C");
        String expectedResult = "Usuario Incorrecto";
        Assertions.assertTrue(actualResult.contains(expectedResult),"");
        //Mockito.verify(userMock).getCorrectUser("AleS");
        //Mockito.verify((permisoMock).getPermission("C"));
    }

    @Test
    public void verifyUserPermission4(){
        Mockito.when(userMock.getCorrectUser("AleS")).thenReturn(true);
        Mockito.when(permisoMock.getPermission("C")).thenReturn("C");
        Permisos permisos = new Permisos(userMock,permisoMock);
        String actualResult = permisos.permisos("AleS","C");
        String expectedResult = "ERROR";
        Assertions.assertTrue(!actualResult.contains(expectedResult),"ERRO");
        //Mockito.verify(userMock).getCorrectUser("AleS");
        //Mockito.verify((permisoMock).getPermission("C"));
    }


}
