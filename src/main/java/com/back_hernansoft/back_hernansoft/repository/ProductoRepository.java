package com.back_hernansoft.back_hernansoft.repository;

import org.springframework.stereotype.Repository;
import com.back_hernansoft.back_hernansoft.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
  
}
