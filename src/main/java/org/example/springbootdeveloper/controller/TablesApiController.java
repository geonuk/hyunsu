package org.example.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbootdeveloper.domain.Tables;
import org.example.springbootdeveloper.dto.*;
import org.example.springbootdeveloper.service.TableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
public class TablesApiController {

    private final TableService tableService;

    @PostMapping("/api/tables")

    public ResponseEntity<Tables> addTables(@RequestBody AddTableRequest request){
        Tables savedTable = tableService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedTable);
    }

    @GetMapping("/api/tables")
    public ResponseEntity<List<TableResponse>> findAllArticles(){
        List<TableResponse> tables = tableService.findAll()
                .stream()
                .map(TableResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(tables);
    }

    @GetMapping("/api/tables/{tnumber}")
    public ResponseEntity<TableResponse> findTable(@PathVariable long tnumber) {
        Tables tables = tableService.findById(tnumber);

        return ResponseEntity.ok()
                .body(new TableResponse(tables));
    }

    @DeleteMapping("/api/tables/{tnumber}")
    public ResponseEntity<Void> deleteTable(@PathVariable long tnumber) {
        tableService.delete(tnumber);

        return ResponseEntity.ok()
                .build();
    }

    @PutMapping("/api/tables/{tnumber}")
    public ResponseEntity<Tables> updateTable(@PathVariable long tnumber,
                                              @RequestBody UpdateTableRequest request) {
        Tables updatedTable = tableService.update3(tnumber, request);

        return ResponseEntity.ok()
                .body(updatedTable);
    }
}
