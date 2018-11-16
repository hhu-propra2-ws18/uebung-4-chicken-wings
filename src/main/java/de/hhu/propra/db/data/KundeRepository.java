package de.hhu.propra.db.data;

import de.hhu.propra.db.entities.Auto;
import de.hhu.propra.db.entities.Kunde;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KundeRepository extends CrudRepository<Kunde, Long> {

    public List<Kunde> findAll();
    public List<Auto> findByAutosFarbe(String farbe);
}
