package pl.company.strefakusow.plscomsk.entity;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long idEmployee;

    @Column
    private String firstName;

    @Column
    private Long lastName;




    @OneToOne(mappedBy = "employee")
    private Operator operator;
}
