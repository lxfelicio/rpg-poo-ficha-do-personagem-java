# 🧙‍♂️ RPG - Ficha do Personagem em Java (POO)

Projeto prático em Java que usa personagens de RPG para aplicar os pilares da Programação Orientada a Objetos (POO): Abstração, Encapsulamento, Herança e Polimorfismo.

---

## 🗡️ Sobre o Desafio

Este projeto foi desenvolvido como parte do desafio da DIO: **"Abstraindo um Bootcamp Usando Orientação a Objetos em Java"**. O objetivo é praticar os fundamentos da Programação Orientada a Objetos com um exemplo lúdico e criativo.

---

## 🧝 O que foi desenvolvido

A ideia é simular a criação de fichas de personagens para um RPG de mesa, como D&D. Cada personagem possui atributos, classe, raça e métodos personalizados. O projeto conta com:

- 🧱 Classe base (Personagem) representa a **estrutura comum de todos os personagens**, reunindo atributos como nome, raça, classe, nível, vida e métodos genéricos como exibirFicha().
- 🧬 As classes Bárbaro, Bruxo, Clérigo e Druida **herdam** a estrutura da classe Personagem, aproveitando atributos e métodos em comum, e **especializando** comportamentos.
- 🌀 Os métodos atacar() e defender() são **polimórficos**, ou seja, cada classe filha **sobrescreve** esses métodos para implementar comportamentos distintos conforme o tipo do personagem.
- 🛡️ Os atributos da classe Personagem estão **encapsulados**, com private e métodos getters e setters públicos, garantindo **controle de acesso e integridade dos dados**.
- ✨ A classe Personagem atua como uma **abstração** de um personagem de RPG, representando de forma simplificada as **características essenciais** comuns a todas as subclasses.

---

## 🗂️ Estrutura do Projeto

rpg-poo-ficha-do-personagem-java/
├── src/
│   └── rpg/
│       ├── Main.java
│       ├── Personagem.java
│       ├── Barbaro.java
│       ├── Bruxo.java
│       ├── Clerigo.java
│       ├── Druida.java
│       ├── Raca.java
│       └── Util.java
└── README.md

---

## 📘 Aprendizados

✔️ Aplicação prática dos 4 pilares da POO  
✔️ Organização de código em pacotes e classes  
✔️ Abordagem lúdica para fixar conceitos complexos  
✔️ Prática com abstração e hierarquia de classes  
✔️ Uso de herança e polimorfismo de forma clara e simples  

---

## 🧠 Autoria

Este tutorial foi desenvolvido por **Laura Felício** como parte dos estudos sobre Java e POO e para a conclusão do desafio de projeto **“Abstraindo um Bootcamp Usando Orientação a Objetos em Java”**, oferecido pela plataforma DIO.

⚠️ Este conteúdo tem finalidade exclusivamente didática e pode conter pequenos erros.  
💬 Contribuições, sugestões ou correções são bem-vindas via GitHub: 🔗 https://github.com/lxfelicio

⌨️ Criado com 🪄, 📜 e 🎲 por **Laura Felício**
