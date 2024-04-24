package repositories;

import entities.PasswordRecord;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PasswordRecordRepository extends JpaRepository<PasswordRecord, Integer> {

    Optional<PasswordRecord> findById(Long id);
}


