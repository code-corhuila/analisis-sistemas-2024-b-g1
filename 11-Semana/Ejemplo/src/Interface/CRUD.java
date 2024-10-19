package Interface;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface CRUD {

    Object  Save(Object entity);
    void Update(Object entity, Long id);
    List<Object> All();
    Optional<Object> FindById(Long id);
    void Delete(Long id);
    List<Object> ListData();
}
