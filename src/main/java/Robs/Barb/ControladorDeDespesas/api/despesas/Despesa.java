
package Robs.Barb.ControladorDeDespesas.api.despesas;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Despesas")
@Entity(name = "Despesa")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private FormaDePagamento formaDePagamento;

    private Double valor;

    private String diaFixo;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private Boolean pago;

    private Boolean ativo;

    public Despesa(DadosCadastroDespesa dados) {
        this.ativo=true;
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.formaDePagamento = dados.formadepagamento();
        this.categoria = dados.categoria();
        this.diaFixo = dados.diaFixo();
        this.valor = dados.valor();
        this.pago = dados.pago();

    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoDespesa dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.valor() != null ){
            this.valor = dados.valor();
        }
        if (dados.pago() != null){
            this.pago=dados.pago();
        }
    }

    public void excluir() {
        this.ativo=false;
    }

    public void ativar(){
        this.ativo=true;
    }
}
