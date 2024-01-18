package org.info;

import javax.persistence.*;

@Entity
@Table(name = "ProdutoCategoria")
public class ProdutoCategoria {

    @Id
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Id
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;


}
