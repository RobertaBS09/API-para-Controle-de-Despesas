package Robs.Barb.ControladorDeDespesas.api.despesas;

public record DadosListagemDespesa(Long id, String nome,String descricao, FormaDePagamento formaDePagamento, Double valor, String diaFixo,Boolean pago, Boolean ativo) {

    public DadosListagemDespesa (Despesa despesa){
        this(despesa.getId(),despesa.getNome(), despesa.getDescricao(), despesa.getFormaDePagamento(), despesa.getValor(), despesa.getDiaFixo(), despesa.getPago(), despesa.getAtivo());
    }

}
