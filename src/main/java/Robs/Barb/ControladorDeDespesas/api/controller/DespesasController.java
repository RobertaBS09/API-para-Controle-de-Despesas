package Robs.Barb.ControladorDeDespesas.api.controller;

import Robs.Barb.ControladorDeDespesas.api.despesas.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<DadosListagemDespesa> listar(@PageableDefault(size = 10, sort = {"id"},direction = Sort.Direction.ASC) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemDespesa::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoDespesa dados) {
        var despesa = repository.getReferenceById(dados.id());
        despesa.atualizarInformacoes(dados);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var despesa = repository.getReferenceById(id);
        despesa.excluir();
    }

    @PutMapping("/ativar/{id}")
    @Transactional
    public ResponseEntity ativar (@PathVariable Long id){
        if (repository.existsById(id)){
            var despesa =repository.getReferenceById(id);
            despesa.ativar();

        }
        return  ResponseEntity.ok().build();
    }

}
