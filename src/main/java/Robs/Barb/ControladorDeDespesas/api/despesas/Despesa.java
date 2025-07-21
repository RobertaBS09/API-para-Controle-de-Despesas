
package Robs.Barb.ControladorDeDespesas.api.despesas;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "Despesas")
@Entity (name = "Despesa")
@Getter
@NoArgsConstructor
@EqualsAndHashCode (of = "id")
public class Despesa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private FormaDePagamento formaDePagamento;

    private double valor;

    private String diaFixo;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private boolean pago;

    public Despesa(DadosCadastroDespesa dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.formaDePagamento =dados.formadepagamento();
        this.categoria =dados.categoria();
        this.diaFixo= dados.diaFixo();
        this.valor = dados.valor();
        this.pago= dados.pago();

    }
}
