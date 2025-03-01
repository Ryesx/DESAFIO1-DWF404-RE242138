package sv.edu.udb.desafio1dwf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.desafio1dwf.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
