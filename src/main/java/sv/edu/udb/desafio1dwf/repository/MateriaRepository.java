package sv.edu.udb.desafio1dwf.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.desafio1dwf.model.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
}