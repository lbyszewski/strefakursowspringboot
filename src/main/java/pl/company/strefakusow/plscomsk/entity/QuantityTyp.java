package pl.company.strefakusow.plscomsk.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class QuantityTyp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long idQuantityType;

    @Column
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "quantityTyp")
    List<Item> itemList;
}
