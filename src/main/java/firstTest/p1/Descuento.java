package firstTest.p1;

public class Descuento {
    public String getMessage(int salario) throws Exception{
        String msg;
        if (salario <= 0){
            throw new Exception("Salario no valido");
        } else if (salario > 0 && salario <= 2000){
            msg = "El sueldo es menor o igual que el salario mínimo el salario actual es: " + salario;
        }else if(salario >= 2001 && salario <= 4000){
            msg = "El sueldo es mayor que el salario mínimo el salario actual es: " + (salario * 0.95);
        }else {
            msg = "El sueldo es mayor que el doble del salario mínimo el salario actual es: " + (salario * 0.85);
        }
        return msg;
    }
}
