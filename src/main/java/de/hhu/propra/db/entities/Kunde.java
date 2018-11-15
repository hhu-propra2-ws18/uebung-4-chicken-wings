package de.hhu.propra.db.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data // Lombok - Generiert Getter, Setter, toString, ...
@Entity
public class Kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String stadt;
    private Integer plz;

    private List<Auto> autos;

    // TODO: Hier muss irgendetwas mit Autos hin...
}
