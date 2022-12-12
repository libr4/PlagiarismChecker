A DRIVER CLASS É A INTERFACE.JAVA, PORTANTO, PARA RODAR O PROGRAMA, DEVE-SE RODÁ-LA.

# Plagiarism Checker - Projeto Final
# Equipe 5
* Brian Lucas Dias Santos Machado
* Iasmim Da Cruz Marinho 
* Jonas Oliveira Pereira 
* Laion Silva Nascimento
* Matheus Costa Pinto Marcal
* Yuri Freitas Hughes 
* Benjamin Anderson

# O PROPÓSITO

Desenvolver um software capaz de auxiliar seus usuários (professor ou aluno) a identificarem a possibilidade de terem sido plagiados, no caso de alunos, ou de estarem recebendo uma atividade plagiada, no caso de professores. Este tipo de ferramenta auxilia, principalmente, educadores a avaliarem estudantes, pois, aponta alunos que submeteram tarefas duplicadas por não terem aprendido e desencoraja essa prática. 
Projeto inspirado no <b>ICSE 2023</b>, usado como projeto final para disciplina de Engenharia de Software. 

# MODELO DE CICLO DE VIDA

Escolhemos o modelo de desenvolvimento incremental, devido aos requisitos claros e imutáveis desde o início, ao pequeno porte do projeto e à ausência de um cliente nas etapas de desenvolvimento. Este modelo nos possibilitará revisitar as etapas anteriores depois de cada incremento, o que nos permitirá refatorar, sempre que necessário, o diagrama de classes.
Para lidar com uma das principais dificuldades deste modelo - o desafio de se manter um código que cresce a cada incremento sem precisar reestruturá-lo toda vez - nós nos utilizaremos, além das boas práticas da programação orientada a objetos, da etapa de Análise e Design no início de todo incremento para refatorar o diagrama de classes de acordo com as necessidades do projeto. Em cada incremento, a equipe irá se focar em um requisito, começando dos mais básicos e fundamentais.

# LINGUAGEM: Java

# Cronograma de desenvolvimento
### Reunião 1 - 22/10
  Discussão sobre o modelo de classes e definição da primeira versão.
### Reunião 2 - 9/11
Definição de responsabilidades entre os integrantes. (Taks / responsável/ prazo)
- [x] Gerenciador do projeto - Matheus - 12/11/2022
- [x] Concluir User stories/Requisitos - Benjamin - 12/11/2022
- [ ] Finalizar modelo de classes - Yuri - 12/11/2022
- [x] Plano de desenvolvimento - Iasmim - 12/11/2022
- [ ] Projeto em Execução v1 - Jonas, Laion, Brian e os outros ajudam conforme finalize a atividade. - 21/11/2022
  
# LISTA DE REQUISITOS (em nenhuma ordem específica)
### A aplicação deve:
* indicar suspeita de troca de variáveis
* listar parágrafos semelhantes
* listar frases semelhantes
* gerar relatório auxiliar de similaridade (parágrafos ou frases), para o prof analisar
* reconhecer todos os parágrafos em um texto
* reconhecer todas as frases em um texto
* reconhecer e extrair texto em uma imagem
* permitir a escolha entre granularidade de frases ou parágrafos
* testar e comparar tempo de execução do código
* testar e comparar tamanho do arquivo do código
* ter a possibilidade de cadastro como aluno ou professor
* ter possibilidade de autenticar-se por login e senha
* ter uma interface web

### USER STORIES

Como professor, eu gostaria de realizar login com e-mail e senha cadastrados, para acessar a área de professor.

Como estudante, gostaria de realizar login com e-mail e senha cadastrados para acessar a área de alunos.

Como estudante, gostaria de ter acesso às atividades/trabalhos através do link de convite para submeter meu trabalho.

Como estudante, gostaria de poder solicitar análise de plágio no banco de dados (onde contém as atividades enviadas pelos alunos). para verificar se foi plagiada.

Como professor, gostaria de uma interface intuitiva para enviar tarefas.
		
Como professor, gostaria de um botão para enviar tarefas.

Como professor, gostaria de ter acesso aos resultados da análise em relatório (checagem de cada aluno), identificando o nome do aluno, o trabalho enviado e o resultado da análise de plágio.

Como professor, eu gostaria de poder solicitar análise de plágio no banco de dados (onde contém as atividades enviadas pelos alunos).

Como professor, gostaria de realizar análise de plágio para códigos e código-fonte dos trabalhos enviados, para identificar ocorrências de plágio.

# Modelos de Classes
### v1
![dc](https://user-images.githubusercontent.com/72471500/201446841-0d90a9b1-a15d-46db-b6e4-77b68c02fdbc.png)

### v2

Disponível em: <a href="https://app.diagrams.net/#G1c6baV5upgwpJMoCh_v7Xl7_J3I2W9ZfE">Diagrama de classes<a>

# Gerenciador do Projeto
<a href="https://trello.com/b/PtgWK2A0/projeto-eng-soft-equipe-5">Gerenciador do Projeto</a>

# Repositório no Github
<a href="https://github.com/IasmimMarinho/Equipe-5---Plagiarism-Checker-for-Assignments-in-Computer-Science-Courses">Repositório</a>

# Referências
https://docs.google.com/document/d/1od7NcSIeTqVu0jj97FUuI1KQCgNzYCpZp2cXyWQ8SPg/edit
