package com.example.curriculo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curriculo.*;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    // Métodos de consulta personalizados, se necessário
}
