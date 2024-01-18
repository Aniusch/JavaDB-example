package org.info;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String numeroPedido;

    @Temporal(TemporalType.DATE)
    private Date dataPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


}
