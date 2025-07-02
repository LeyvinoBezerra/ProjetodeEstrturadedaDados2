package br.edu.ufersa.core;

/*
  ✅ 2. Índice AVL: NoAVL e AVL com referência
 */
public class NoAVL {

  int chave;
  RegistroClimatico referencia;
  NoAVL esquerda, direita;
  int altura;

  NoAVL(int chave, RegistroClimatico referencia) {
    this.chave = chave;
    this.referencia = referencia;
    this.altura = 1;
  }
}
