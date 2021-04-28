package pl.company.strefakusow.plscomsk.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long idItem;

    @Column
    private  String name;

    @Column
    private Double quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idQuantityType")
    private QuantityTyp quantityTyp;


    @ManyToMany
    @JoinTable(
            name = "item_warhouse",
            joinColumns = @JoinColumn(name = "idItem"),
            inverseJoinColumns = @JoinColumn(name = "idWarHouse")
    )
    private Set<Warhouse> warhouseSet;
}
