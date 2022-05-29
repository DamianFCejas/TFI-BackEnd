package com.portfolio.ProyectoFinal.repository;

import com.portfolio.ProyectoFinal.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
    List<User> findByUsernameAndIsEnabledTrue(String username);
    
}

/*
package com.portfolio.ProyectoFinal.repository;

import com.portfolio.ProyectoFinal.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<user, Integer>{
    User findByUsername(String username);
    User findByUsernameAndPassword(String username, String password);
    
}
*/