package Robs.Barb.ControladorDeDespesas.api.controller;

import Robs.Barb.ControladorDeDespesas.api.despesas.DadosCadastroDespesa;
import Robs.Barb.ControladorDeDespesas.api.despesas.Despesa;
import Robs.Barb.ControladorDeDespesas.api.despesas.DespesaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("despesas")
public class DespesasController {

    @Autowired
    private DespesaRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroDespesa dados) {

        repository.save(new Despesa(dados));

    }
}
