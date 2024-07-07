package onedigitalinnovation.santander_dev_week_2024.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}