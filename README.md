# Módulo Intermediário - Trilha Java

Esta pasta contém a evolução dos projetos desenvolvidos no módulo básico, incorporando interface gráfica, persistência em banco relacional, tipos genéricos e testes automatizados de software.

---

## Competências Trabalhadas

- **Interface Gráfica com JavaFX:** Construção de interfaces com arquivos FXML, folhas de estilo CSS e padrão MVC (separação entre layout e Controller).
- **Banco de Dados Relacional com JDBC:** Persistência no SQLite com `PreparedStatement`, `ResultSet`, prevenção contra SQL Injection e controle de transações (`commit`/`rollback`).
- **Generics Avançado:** Definição de classes parametrizadas (`<T extends Tarefa>`) e métodos com curingas (`?`, `? extends T`, `? super T`).
- **Testes Automatizados com JUnit:** Testes unitários para regras de domínio e persistência isolada com banco de dados SQLite em memória RAM (`:memory:`).

---

## Status dos Projetos

| Projeto | Descrição | Status |
| :--- | :--- | :---: |
| **[Projeto 1: TaskManager](projeto-1-taskmanager)** | Gerenciador de tarefas com interface JavaFX, banco SQLite e suíte de 11 testes JUnit. | Concluído |
| **[Projeto 2: FinTracker](projeto-2-fintracker)** | Sistema de finanças com JavaFX, tabela de transações e banco SQLite. | Em desenvolvimento |
| **[Projeto 3: MyContacts](projeto-3-mycontacts)** | Agenda visual com JavaFX, formulário de contatos e banco SQLite. | Em desenvolvimento |

---

## Como Executar o Projeto 1 (TaskManager)

1. Abra o Apache NetBeans.
2. Acesse **Arquivo** > **Abrir Projeto** e selecione a pasta `projeto-1-taskmanager`.
3. Pressione **F6** para executar a aplicação via classe `Launcher`.
4. Pressione **Alt + F6** para rodar a suíte completa de testes unitários.
