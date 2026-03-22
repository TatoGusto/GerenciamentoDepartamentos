package com.oasw.GerenciamentoDepartamentos.Controllers;

import com.oasw.GerenciamentoDepartamentos.Models.DepartamentoModel;
import com.oasw.GerenciamentoDepartamentos.Services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/departamentos")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<DepartamentoModel> create(DepartamentoModel departamentoModel){
        DepartamentoModel request = departamentoService.create(departamentoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(departamentoModel.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<DepartamentoModel>> getAll(){
        List<DepartamentoModel> request = departamentoService.getAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DepartamentoModel> getById(@PathVariable Long id){
        DepartamentoModel request = departamentoService.getById(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(Long id){
        departamentoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
