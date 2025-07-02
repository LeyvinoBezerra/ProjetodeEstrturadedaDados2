package br.edu.ufersa.core;

public class Servidor {
  RegistroClimatico inicioLista = null;
  ArvoreAVL indiceAVL = new ArvoreAVL();

  public void inserirRegistro(RegistroClimatico novo) {
    novo.proximo = inicioLista;
    inicioLista = novo;
    indiceAVL.inserir(novo.idRegistro, novo);
  }

  public RegistroClimatico buscarPorId(int id) {
    return indiceAVL.buscar(id);
  }

  public void listarRegistros() {
    RegistroClimatico atual = inicioLista;
    while (atual != null) {
      System.out.println("ID: " + atual.idRegistro + " | Dispositivo: " + atual.idDispositivo);
      atual = atual.proximo;
    }
  }

  public boolean removerRegistro(int id) {
    RegistroClimatico atual = inicioLista, anterior = null;
    while (atual != null && atual.idRegistro != id) {
      anterior = atual;
      atual = atual.proximo;
    }
    if (atual == null) return false; // Não encontrado
    if (anterior == null) inicioLista = atual.proximo;
    else anterior.proximo = atual.proximo;
    // Nota: não removemos da AVL pois o método ainda não foi implementado.
    return true;
  }

  public boolean alterarRegistro(int id, double novaTemp, double novaUmidade, double novaPressao) {
    RegistroClimatico r = buscarPorId(id);
    if (r == null) return false;
    r.temperatura = novaTemp;
    r.umidade = novaUmidade;
    r.pressao = novaPressao;
    return true;
  }
}
