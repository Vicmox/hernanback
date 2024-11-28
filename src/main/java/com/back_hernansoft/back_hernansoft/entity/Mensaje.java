package com.back_hernansoft.back_hernansoft.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mensaje {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id_mensaje;
  private String contenido;
  private long id_usuario;
  private long id_usuario_destino;
  private long id_usuario_origen;  

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
    return id_usuario_destino;
  }

  public void setId_usuario(long id_usuario) {
    this.id_usuario = id_usuario;
  }

  public void setId_usuario_destino(long id_usuario_destino){
    this.id_usuario_destino = id_usuario_destino;
  }

  
}