package com.back_hernansoft.back_hernansoft.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="mensaje")
public class Mensaje {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id_mensaje;
  @Column(name="contenido")
  private String contenido;
  @Column(name="id_usuario")
  private long id_usuario;
  @Column(name="id_destinatario")
  private long id_destinatario;

  public long getId_mensaje() {
    return id_mensaje;
  }
  
  public void setId_mensaje(long id_mensaje){
    this.id_mensaje = id_mensaje;
  }
  
  public String getContenido() {
    return contenido;
  }

  public void setContenido(String contenido) {
    this.contenido = contenido;
  }

  public long getId_usuario() {
    return id_usuario;
  }

  public long getId_usuario_destino() {
    return id_destinatario;
  }

  public void setId_usuario(long id_usuario) {
    this.id_usuario = id_usuario;
  }

  public void setId_usuario_destino(long id_usuario){
    this.id_destinatario = id_usuario;
  }

  
}