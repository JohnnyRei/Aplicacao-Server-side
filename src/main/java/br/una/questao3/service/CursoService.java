package br.una.questao3.service;

import br.una.questao3.domain.Curso;
import br.una.questao3.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class CursoService {

    CursoRepository cursoRepository;

    public Curso cadastrar(Curso novoCurso) {
        return cursoRepository.save(novoCurso);
    }

    public Optional<Curso> buscar(Long id) {
        return cursoRepository.findById(id);
    }

    public ResponseEntity<Curso> atualizar(Long idCurso, Curso cursoAtualizado) {
        if (!cursoRepository.existsById(idCurso))
            return ResponseEntity.notFound().build();

        cursoAtualizado.setId(idCurso);

        cursoRepository.save(cursoAtualizado);

        return ResponseEntity.ok(cursoAtualizado);
    }

    public ResponseEntity<Curso> excluir(Long idCurso) {
        if (!cursoRepository.existsById(idCurso))
            return ResponseEntity.notFound().build();

            cursoRepository.deleteById(idCurso);

            return ResponseEntity.ok().build();
    }

}
