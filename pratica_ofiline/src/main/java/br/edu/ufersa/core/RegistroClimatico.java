package br.edu.ufersa.core;

import java.time.LocalDateTime;

/*
  ✅ 1. Estrutura base: RegistroClimatico (lista ligada)
 */
public class RegistroClimatico {
  int idRegistro;
  String idDispositivo;
  LocalDateTime dataHora;
  double temperatura, umidade, pressao;
  RegistroClimatico proximo;


  public RegistroClimatico(int id, String dispositivo, LocalDateTime dataHora,
      double temperatura, double umidade, double pressao) {
    this.idRegistro = id;
    this.idDispositivo = dispositivo;
    this.dataHora = dataHora;
    this.temperatura = temperatura;
    this.umidade = umidade;
    this.pressao = pressao;
    this.proximo = null;
  }
}

