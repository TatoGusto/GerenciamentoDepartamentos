package com.oasw.GerenciamentoDepartamentos.Repositories;

import com.oasw.GerenciamentoDepartamentos.Models.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<DepartamentoModel,Long> {
}
