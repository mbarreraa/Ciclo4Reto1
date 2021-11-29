package co.edu.usa.misiontic.ciclo4.reto1.crud;

import co.edu.usa.misiontic.ciclo4.reto1.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Miguel Barrera
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
