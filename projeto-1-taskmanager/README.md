# TaskManager - Gerenciador de Tarefas

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/JavaFX-4285F4?style=for-the-badge&logo=java&logoColor=white" alt="JavaFX" />
  <img src="https://img.shields.io/badge/SQLite-003B57?style=for-the-badge&logo=sqlite&logoColor=white" alt="SQLite" />
  <img src="https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit" />
  <img src="https://img.shields.io/badge/Apache_NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white" alt="NetBeans" />
</p>

Projeto de gerenciamento de tarefas desenvolvido para o programa Capacita IREDE. O repositório demonstra a progressão prática de uma aplicação em console (módulo básico) para uma arquitetura com interface gráfica, banco de dados relacional, tipos genéricos e testes automatizados (módulo intermediário).

---

## Escopo do Projeto

O projeto foi estruturado em duas etapas de aprendizado:

1. **Versão Console (Módulo Básico):** Foco em fundamentos de Programação Orientada a Objetos, encapsulamento, coleções e tratamento de erros via terminal.
2. **Versão Visual (Módulo Intermediário):** Evolução da arquitetura com:
   - Interface gráfica construída em JavaFX com arquivos FXML e estilos em CSS.
   - Persistência em banco de dados relacional SQLite utilizando JDBC.
   - Aplicação de Generics com restrições (`<T extends Tarefa>`) e curingas (`?`, `? extends T`, `? super T`).
   - Cobertura de testes unitários automatizados com JUnit, incluindo banco de dados em memória.

---

## Funcionalidades

- **Cadastro de tarefas:** Registro de título e descrição com validação de campos obrigatórios.
- **Listagem de tarefas:** Exibição estruturada em `TableView` com atualização em tempo real.
- **Edição de tarefas:** Alteração de dados cadastrados por meio de janela modal.
- **Conclusão de tarefas:** Atualização do estado de conclusão no banco de dados e na interface.
- **Exclusão de tarefas:** Remoção de registros precedida por diálogo de confirmação (`Alert.CONFIRMATION`).
- **Validação e exceções:** Classe `TarefaException` para tratamento de inconsistências de negócio.
- **Controle transacional:** Métodos com controle explícito de transações (`commit` e `rollback`).
- **Compatibilidade:** Manutenção da versão original em terminal (`Main.java`) e da versão gráfica (`Launcher.java`).

---

## Tecnologias e Conceitos

| Componente | Descrição Técnica |
| :--- | :--- |
| **Java JDK** | Versão 17 ou superior. |
| **JavaFX / FXML** | Construção da camada de apresentação com separação entre layout e controle. |
| **CSS** | Folhas de estilo para padronização visual dos componentes gráficos. |
| **JDBC** | Conexão e manipulação do banco via `PreparedStatement` e `ResultSet`. |
| **SQLite** | Banco relacional embarcado, com criação automática da tabela na inicialização. |
| **JUnit** | Testes automatizados unitários para validação de regras de negócio e persistência. |
| **Generics** | Estruturas de manipulação genérica com uso de wildcards limitados e ilimitados. |

---

## Estrutura de Diretórios

```text
TaskManager/
├── src/
│   ├── app/
│   │   ├── Launcher.java             # Ponto de entrada da interface gráfica
│   │   ├── MainApplication.java      # Classe base do ciclo de vida JavaFX
│   │   └── Main.java                 # Ponto de entrada da versão console
│   ├── controller/
│   │   ├── TarefaController.java     # Controlador da visualização principal
│   │   ├── TarefaFormController.java # Controlador do formulário modal
│   │   └── TaskManager.java          # Implementação de estruturas com Generics
│   ├── database/
│   │   ├── Conexao.java              # Gerenciamento de conexões JDBC
│   │   ├── DatabaseInitializer.java  # Criação do schema de banco de dados
│   │   └── TesteConexao.java         # Teste de conectividade
│   ├── exceptions/
│   │   └── TarefaException.java      # Exceção customizada de domínio
│   ├── model/
│   │   ├── Tarefa.java               # Entidade de domínio
│   │   └── TarefaPrioritaria.java    # Especialização de tarefa para tipos genéricos
│   ├── repository/
│   │   └── TarefaRepository.java     # Camada de acesso a dados (DAO / Repository)
│   └── view/
│       ├── Principal.fxml            # Layout da tela principal
│       ├── TarefaForm.fxml           # Layout do formulário de cadastro/edição
│       └── estilo.css                # Estilização CSS da interface
└── test/
    ├── model/
    │   └── TarefaTest.java           # Testes unitários das regras da entidade
    └── repository/
        └── TarefaRepositoryTest.java # Testes de persistência com SQLite em memória
```

---

## Testes Automatizados

O projeto contém 11 testes automatizados desenvolvidos com JUnit, distribuídos entre regras de domínio e persistência.

### Isolamento de Testes com Banco em Memória

Para evitar alterações na base de dados principal (`taskmanager.db`) durante as validações, os testes de persistência utilizam uma base SQLite instanciada em memória RAM (`jdbc:sqlite::memory:`):

```java
public static Connection conectarTeste() throws SQLException {
    return DriverManager.getConnection("jdbc:sqlite::memory:");
}
```

### Execução dos Testes

- **No NetBeans:** Clique com o botão direito sobre o projeto e selecione **Testar** (ou atalho `Alt + F6`).
- **Via terminal (Ant):**
  ```bash
  ant test
  ```

---

## Instruções de Execução

### Pré-requisitos

- Java Development Kit (JDK) 17 ou superior.
- Apache NetBeans IDE (ou IDE compatível com projetos Ant).
- JavaFX SDK compatível com a versão do JDK utilizada.

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/Rebecabl/TaskManager.git
   ```

2. Abra o projeto no Apache NetBeans:
   - Acesse **Arquivo** > **Abrir Projeto**.
   - Selecione a pasta `TaskManager`.

3. Execute a aplicação:
   - Pressione **F6** ou clique em **Executar Projeto**.
   - A classe `app.Launcher` inicializa a base de dados necessária e abre a interface gráfica.

---

## Autoria

Projeto mantido por **Rebeca** (Instrutora de Programação Java - Capacita IREDE).  
Perfil no GitHub: [Rebecabl](https://github.com/Rebecabl)
