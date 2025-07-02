# 🌳 Prática 1 – Árvore AVL

**Universidade Federal Rural do Semi-Árido – UFERSA**  
Graduação em Ciência da Computação – DC – CCEN  
Disciplina: Estrutura de Dados II  
Professor: Paulo Henrique Lopes Silva  

---

## 🧩 Objetivo

Implementar uma árvore AVL genérica com operações de inserção, remoção e busca, utilizando rotação para manter o balanceamento da estrutura. A prática inclui também testes com diferentes tipos de nós e tratamento de chaves duplicadas.

---

## 📚 Estrutura do Projeto

### Classes Base:

- `No<K, V>`: Representa um nó genérico da árvore AVL.
  - `K`: Tipo da chave (implementa `Comparable<K>`)
  - `V`: Tipo do valor associado
  - Campos:
    - `K chave`
    - `V valor`
    - `int alturaNo`
    - `No<K,V> esq, dir`

- `ArvoreAVL<K, V>`: Implementa os métodos da árvore AVL.
  - Campos:
    - `No<K,V> raiz`
  - Métodos principais:
    - `inserir(K chave, V valor)`
    - `remover(K chave)`
    - `buscarIterativo(K chave)`
    - `obterMaiorNaSubArvoreEsquerda(No<K,V> no)`
    - `rotacaoDireitaSimples(...)`
    - `rotacaoEsquerdaSimples(...)`

---

## 🛠️ Funcionalidades Implementadas

- ✅ Inserção com balanceamento AVL  
- ✅ Remoção com tratamento para:
  - Nó sem filhos
  - Nó com um filho
  - Nó com dois filhos  
- ✅ Atualização de valores em caso de inserção de chave existente  
- ✅ Busca iterativa por chave  
- ✅ Impressão de rotação aplicada em caso de desbalanceamento  
- ✅ Substituição por maior chave da subárvore esquerda (alternativa à menor chave da direita)  
- ✅ Classes genéricas com comparação de chave usando `compareTo()`  

---

## 🔍 Testes Realizados

### Inserções:

```text
Chaves: 12, 23, 34, 45, 56, 27, 5, 13, 17, 18, 35, 41, 38
