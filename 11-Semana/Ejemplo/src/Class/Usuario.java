package Class;

import Abstract.Auditoria;

import java.util.List;
import java.util.Optional;
import Class.Persona;

public class Usuario extends Auditoria {
    private String usuario;
    private String contrasenia;
    private Persona personaId;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
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
}
