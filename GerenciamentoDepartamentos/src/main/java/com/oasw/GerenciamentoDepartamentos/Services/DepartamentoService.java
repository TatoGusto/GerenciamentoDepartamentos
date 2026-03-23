package com.oasw.GerenciamentoDepartamentos.Services;

import com.oasw.GerenciamentoDepartamentos.Models.DepartamentoModel;
import com.oasw.GerenciamentoDepartamentos.Repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public DepartamentoModel createDepartamento(DepartamentoModel departamentoModel){
        return departamentoRepository.save(departamentoModel);
    }

    public List<DepartamentoModel> getAll(){
        return departamentoRepository.findAll();
    }

    public DepartamentoModel getById(Long id){
        return departamentoRepository.getById(id);
    }

    public void deleteById(Long id){
        departamentoRepository.deleteById(id);
    }
}
