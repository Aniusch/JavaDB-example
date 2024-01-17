package org.info;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    private String cargo;

    @Temporal(TemporalType.DATE)
    private Date dataContratacao;

}
