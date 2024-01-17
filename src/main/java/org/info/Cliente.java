package org.info;


import jakarta.persistence.GenerationType;

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    private String endereco;

    private String telefone;

}
