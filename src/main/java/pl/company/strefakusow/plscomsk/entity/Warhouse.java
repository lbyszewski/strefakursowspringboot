package pl.company.strefakusow.plscomsk.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Warhouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idWarHouse;

    @Column
    private String name;

    @ManyToMany(mappedBy = "warhouseSet")
    private Set<Item> itemSet;


}
