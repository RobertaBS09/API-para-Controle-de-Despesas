package Robs.Barb.ControladorDeDespesas.api.despesas;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public record DadosCadastroDespesa(
        @NotBlank
        String nome,

        @NotBlank
        String descricao,

        @NotNull
        FormaDePagamento formadepagamento,

        @NotNull
        @Positive
        double valor,

        @NotNull
        @Pattern(regexp = "^(primeiroDiaUtil|quintoDiaUtil|ultimoDiaUtil)$")
        String diaFixo,

        @NotNull
        boolean pago,

        @NotNull
        Categoria categoria
) {

}
