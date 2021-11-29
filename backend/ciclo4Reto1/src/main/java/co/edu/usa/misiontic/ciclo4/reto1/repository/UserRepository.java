package co.edu.usa.misiontic.ciclo4.reto1.repository;

import co.edu.usa.misiontic.ciclo4.reto1.crud.UserCrudRepository;
import co.edu.usa.misiontic.ciclo4.reto1.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miguel Barrera
 */
@Repository
public class UserRepository {

    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }

    public User save(User user) {
        return userCrudRepository.save(user);
    }

    public Optional<User> existeEmail(String email) {
        return userCrudRepository.findByEmail(email);
    }

    public Optional<User> autenticarUsuario(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
}
