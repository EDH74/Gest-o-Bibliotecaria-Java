# 📚 Gestão de Biblioteca - POO

A aplicação **Gestão de Biblioteca** é um sistema desktop desenvolvido em Java utilzando os conceitos de **Programação Orientada a Objetos (POO)**. O objetivo do projeto é gerenciar de forma eficiente o fluxo de funcionamento de uma biblioteca, controlando o cadastro de livros, usuários, empréstimos e devoluções.

O projeto conta com uma arquitetura separada entre a lógica de negócio (classes) e a interface gráfica (formulários/Swing).

---

## 🚀 Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)
* **Interface Gráfica:** Java Swing / AWT
* **IDE de Desenvolvimento:** NetBeans IDE
* **Paradigma principal:** Programação Orientada a Objetos (Abstração, Encapsulamento, Herança e Polimorfismo)

---

## 🛠️ Funcionalidades Principais

*(Ajuste esta lista de acordo com as telas e regras que você criou no seu projeto)*

* **Gerenciamento de Livros:** Cadastro, edição, exclusão e consulta de acervo (Título, Autor, ISBN, Ano, etc.).
* **Gerenciamento de Usuários:** Cadastro de leitores/clientes (Nome, CPF, Telefone, Endereço).
* **Controle de Empréstimos:** Registro de saídas de livros associando o título ao usuário e definindo uma data de devolução.
* **Devoluções e Multas:** Baixa no sistema quando o livro retorna e cálculo automático de dias de atraso ou multas (se aplicável).
* **Persistência de Dados:** Armazenamento dos dados *(ex: em arquivos TXT, Coleções/Lists em memória ou Banco de Dados - preencha aqui como você salvou)*.

---

## 📁 Estrutura do Projeto

A organização dos arquivos no diretório `src/` segue as boas práticas de divisão de responsabilidades:

```text
Gestao-biblioteca-Poo/
├── src/
│   ├── classes/        # Modelos de dados e entidades do sistema (Ex: Livro.java, Usuario.java, Emprestimo.java)
│   └── formulario/     # Telas e interfaces gráficas desenvolvidas em JFrame/Swing
├── build/              # Arquivos compilados (.class)
├── dist/               # Executável do projeto (.jar gerado pelo NetBeans)
└── nbproject/          # Configurações internas do NetBeans
```
Eduardo Araujo dos Santos - Desenvolvedor do Projeto - @EDH74
---
Rafael Borges Santos - Desenvolvedor do Projeto - @Rafael-KD  
---
