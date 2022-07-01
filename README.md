# Desafio:
Um sistema necessita expor como APIs (application programming interface - interface de programação de aplicações) no modelo Restful, um recurso juntamente com as operações básicas de manutenção (CRUD - criar, ler, atualizar e deletar). O recurso que deve ser exposto representa um Curso. A entidade Curso deve conter no minimo os atributos: Curso (id: long, nome: varchar(255), campus: varchar(255), nroAlunos: long). Usando de recursos do framework spring boot e da tecnologia java implemente uma aplicação server-side que expõe esses dois recursos no modelo Restful API. A aplicação deve ser construída em camadas e deve conter as classes de:  - classe de endpoints do recurso (resource ou controller);  - classe de serviço (service)  - classe de repositório (repository)  - classe de domínio (domain).
