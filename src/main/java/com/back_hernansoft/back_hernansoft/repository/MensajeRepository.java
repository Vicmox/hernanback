package com.back_hernansoft.back_hernansoft.repository;

import org.springframework.stereotype.Repository;
import com.back_hernansoft.back_hernansoft.entity.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface MensajeRepository extends JpaRepository <Mensaje,Long> {
}