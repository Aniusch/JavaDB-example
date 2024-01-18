package org.info;

import javax.persistence.*;

@Entity
@Table(name = "PedidoFuncionario")
public class PedidoFuncionario {

    @Id
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @Id
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

}
