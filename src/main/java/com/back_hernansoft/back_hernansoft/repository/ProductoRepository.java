package com.back_hernansoft.back_hernansoft.repository;

import com.back_hernansoft.back_hernansoft.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
