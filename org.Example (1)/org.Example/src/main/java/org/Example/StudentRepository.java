package org.Example;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface StudentRepository extends JpaRepository<Students,Long>{
}
