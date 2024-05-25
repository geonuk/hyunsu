package org.example.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springbootdeveloper.domain.Tables;
import org.example.springbootdeveloper.dto.AddTableRequest;
import org.example.springbootdeveloper.dto.UpdateTableRequest;
import org.example.springbootdeveloper.repository.TableRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TableService {

    private final TableRepository tableRepository;

    public Tables save(AddTableRequest request){
        return tableRepository.save(request.toEntity());
    }

    public List<Tables> findAll(){
        return tableRepository.findAll();
    }

    public Tables findById(long id){
        return tableRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id) {
        tableRepository.deleteById(id);
    }

    @Transactional
    public Tables update3(long id, UpdateTableRequest request) {
        Tables table = tableRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));

        table.update3(request.getRestaurant(), request.getStatus(),request.getSeat(),request.getXcode(),request.getYcode());

        return table;
    }
}
