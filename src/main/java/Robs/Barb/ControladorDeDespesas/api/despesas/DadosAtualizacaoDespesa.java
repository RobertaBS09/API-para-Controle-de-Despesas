package Robs.Barb.ControladorDeDespesas.api.despesas;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoDespesa(
        @NotNull
        Long id,
        String nome,
        String descricao,
        Double valor,
        Boolean pago
) {
}
