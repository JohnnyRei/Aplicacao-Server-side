package br.una.questao3.controller;

import br.una.questao3.domain.Curso;
import br.una.questao3.service.CursoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("/cursos")
@RestController
public class CursoController {

    CursoService cursoService;

    @PostMapping
    public ResponseEntity<Curso> cadastrar(@RequestBody Curso novoCurso) {
        var resCursoCadastrado = cursoService.cadastrar(novoCurso);

        if (resCursoCadastrado == null)
            return ResponseEntity.badRequest().build();

        return ResponseEntity.status(201).body(resCursoCadastrado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscar(@PathVariable Long id) {
        var resCursoBuscado = cursoService.buscar(id);

        if (resCursoBuscado.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(resCursoBuscado.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> autalizar(@PathVariable Long id,
                                           @RequestBody  Curso cursoAtualizado) {
         return cursoService.atualizar(id, cursoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Curso> excluir(@PathVariable Long id) {
        return cursoService.excluir(id);
    }

}
