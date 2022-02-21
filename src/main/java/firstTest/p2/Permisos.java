package firstTest.p2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Permisos {
    private String msg;
    private PermisoUtils permisos = new PermisoUtils();
    private UserUtils user = new UserUtils();

    public Permisos() {

    }

    public Permisos(UserUtils utilUser, PermisoUtils utilCrud){
        user =utilUser;
        permisos = utilCrud;
    }

    public String permisos(String u, String p){
        if(user.getCorrectUser(u)){
            DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
            msg = p + " "+dt.format(LocalDateTime.now());
        } else {
            msg = "Usuario Incorrecto";
        }
        return msg;
    }

}
