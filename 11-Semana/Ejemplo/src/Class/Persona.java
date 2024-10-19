package Class;

import Abstract.Auditoria;

import java.util.List;
import java.util.Optional;

public class Persona extends Auditoria {
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private byte edad;
    private String direccion;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public Object Save(Object entity) {
        return null;
    }

    @Override
    public void Update(Object entity, Long id) {

    }

    @Override
    public List<Object> All() {
        return List.of();
    }

    @Override
    public Optional<Object> FindById(Long id) {
        return Optional.empty();
    }

    @Override
    public void Delete(Long id) {

    }

    @Override
    public List<Object> ListData() {
        return List.of();
    }

    @Override
    public String toString() {
        return "\nPersona{\n" +
                " tipoDocumento= " + tipoDocumento + "\n" +
                " numeroDocumento= " + numeroDocumento + "\n" +
                " nombre= " + nombre + "\n" +
                " apellido= " + apellido + "\n" +
                " edad= " + edad + "\n"+
                " direccion= " + direccion + "\n" +
                '}';
    }
}
