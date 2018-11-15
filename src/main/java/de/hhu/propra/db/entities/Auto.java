package de.hhu.propra.db.entities;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Auto{

    private Long id;

    private String marke;
    private String farbe;
    private Integer hubraum;
}
