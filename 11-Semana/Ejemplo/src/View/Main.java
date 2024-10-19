package View;

import Abstract.Auditoria;
import Class.*;
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        for(int i = 1; i<=3;i++){
            persona.setTipoDocumento("CC");
            persona.setNumeroDocumento("1234567890");
            persona.setNombre("Juan");
            persona.setApellido("Pérez");
            persona.setEdad((byte) 30);
            persona.setDireccion("Calle Falsa 123, Ciudad XYZ");
            System.out.printf(persona.toString());
        }


        Usuario usuario = new Usuario();

    }
}