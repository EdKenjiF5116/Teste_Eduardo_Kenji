QUERY'S DO MYSQL(tive problemas em relação a esse, não consegui conectar direito já que toda vez que eu tentava dava como host inexistente)

Quantidade de Funcionários por Sexo:
SELECT sexo, COUNT(*) AS qtde_funcionarios
FROM employees
GROUP BY sexo;

Funcionários Distintos por Sexo, Ano e Ano de Nascimento:
SELECT sexo, ano, ano_nascimento, COUNT(DISTINCT employee_id) AS qtde_funcionarios_distintos
FROM employees
GROUP BY sexo, ano, ano_nascimento;

Média, Mínimo e Máximo de Salário por Sexo:
SELECT sexo,
       AVG(salary) AS media_salario,
       MIN(salary) AS salario_minimo,
       MAX(salary) AS salario_maximo
FROM employees
GROUP BY sexo;

ANALISE DOS GRÁFICOS
Analisei os seguintes gráficos (os prints dos gráficos estão na pastal img dentro da pasta assets (acima da SRC) 

Memory/CPU
    ANALISE: O gráfico mostra que a memória foi mais utilizada que a CPU durante todo o período analisado. O pico de uso da memória foi de 6% às 19h21min, diminuindo gradualmente até 2% às 20h10min. Já o pico de uso da CPU foi de 20% às 19h21min, também diminuindo gradualmente até 0% às 20h10min. A quantidade total de memória e CPU disponíveis, as tarefas executadas e o uso de outros recursos (disco rígido, rede) não estão no gráfico. O uso da CPU e da memória varia de acordo com as tarefas em andamento. A temperatura ambiente e a qualidade da energia elétrica também podem afetar o uso de recursos. O uso da CPU e da memória pode variar dependendo do tipo de tarefas que estão sendo executadas no computador. O uso da CPU e da memória também pode ser afetado por fatores externos, como a temperatura ambiente ou a qualidade da energia elétrica.

server requests
    ANALISE: web_server_03 recebeu mais requisições do que web_server_04 entre 19h20min e 20h15min, mas para uma análise mais precisa, algumas informações estão faltando. O gráfico não mostra o tipo de requisição feita (se eram páginas simples, downloads pesados ou algo similar), o tempo de resposta para cada requisição (se o servidor estava demorando para processar as solicitações) nem a capacidade total de processamento de cada servidor (se um deles é mais fraco e por isso recebeu menos requisições). Apesar disso, é possível observar que o web_server_03 processou cerca de 750 requisições nesse período, atingindo um pico de 150 requisições às 19h25min. Já o web_server_04 processou aproximadamente 500 requisições, com um pico de 125 requisições às 19h35min. É importante notar que ambos os servidores tiveram uma diminuição gradual no número de requisições após seus respectivos picos. Seria interessante investigar o tipo de requisição que está sendo feita e se há alguma forma de reduzir a demanda. Por exemplo, se muitas requisições forem para o download de um mesmo arquivo, talvez seja possível disponibilizá-lo em um CDN (Content Delivery Network) para melhorar a performance de acesso.

    SOBRE MIM: 
        
        Como Analista Desenvolvedor Junior em uma empresa de Soluções e Desenvolvimento de Aplicações, forneci suporte a uma Instituição Financeira (Banco do Estado de Sergipe BANESE) e a um Grupo de Investimento na Bolsa de Valores (B3) por meio de ordens de serviço, auxiliando a equipe nos ajustes necessários de acordo com as demandas do cliente.

        Inovador, curioso, autodidata, sempre buscando novos desenvolvimentos e melhorias, sou uma pessoa empática no atendimento ao cliente e sigo regras e regulamentações para o crescimento pessoal e profissional. Gosto de trabalhar em equipe com foco em resultados e busco uma nova oportunidade de carreira em tecnologia para me desenvolver profissionalmente, alinhando-me com a minha formação em Engenharia da Computação. Aspiro a adquirir conhecimento que possa contribuir para um futuro melhor para a sociedade. Agradeço e estou extremamente empolgado com a oportunidade e, se escolhido para fazer parte da sua equipe, farei o meu melhor para atender às expectativas da empresa.

        Meu diploma atual é de Bacharel em Engenharia da Computação, mas estou planejando fazer uma pós-graduação e um mestrado com especialização em Segurança Cibernética, buscando conhecimento sobre Red Team, vulnerabilidades e ataques históricos. Já iniciei os estudos para obter as certificações NSE-1 e NSE-2 da Fortinet, fiz cursos gratuitos de Segurança Cibernética na Cisco Network Academy e estou cursando a certificação CCNP da Cisco.

        Meus hobbies são ler livros, jogar jogos e estudar física (a parte astronômica, ou seja, astrofísica) e física quântica. Também gosto de ouvir música.

        Recentemente, evolui e melhorei minhas habilidades de comunicação graças aos desafios que a minha faculdade propõe aos alunos durante o curso. Um deles foi com o Hospital Alemão Oswaldo Cruz, outro com a Natura (ano passado) e este ano é com a Sanofi. Nessas situações, essas empresas parceiras da faculdade dão aos alunos, em média, de 6 a 7 meses para trabalhar em uma solução para o seu problema.
        
        Também participamos do programa "Global Solutions", onde outras empresas nos apresentam um problema para resolvermos, mas temos apenas 3 semanas para isso. No ano passado, meu grupo e eu fomos reconhecidos pela empresa (não era a Natura) pela solução que criamos e, com isso, recebemos um prêmio.

    ABOUT ME:
        As a Junior Developer Analyst at a Solutions and Application Development company, I provided support to a Financial Institution (Banco do Estado de Sergipe BANESE) and an Investment Group in the Stock Exchange (B3) through service orders, assisting the team in necessary adjustments as per client demands.
        
        Innovative, curious, self-taught, always seeking new developments and improvements, empathetic person in customer attendance, and adhering to rules and regulations for personal and professional growth. I enjoy working in a team with a focus on results and I am seeking a new career opportunity in technology for professional development, aligning with my choice in Computer Engineering. I aspire to acquire knowledge that can contribute to a better future for society. I appreciate and am extremely excited about the opportunity, and if chosen to be part of your team, I will do my best to meet the company's expectations.
        
        My current degree is a Bachelor's in Computational Engineering but I'm planning to get a post-degree and a master's degree specializing in Cybersecurity searching about Red Team, vulnerabilities, and attacks that happened during history. And get specialized in Cybersecurity also. I already started working on getting an NSE-1 and NSE-2 certifications from FORTINET, Cybersecurity free courses available on Cisco Network Academy, and many other certificates. I'm currently studying to get the CCNP certification from CISCO.
        
        My hobbies are reading books, playing games, and studying physics (the astronomic part of it, so the astrophysics) and quantum physics, I listen to music too. 
        
        Recently I evolved and upgraded my talking skills thankfully to the Challenges my college gives to the students during the course, one was with Hospital Alemão Oswaldo Cruz, the other with Natura and this year is with Sanofi. In this situation, these college partners give the students, more and less, 6 or 7 months to work on a solution for their problem. 
        
        We also have Global Solutions where other companies give us a problem to solve but we have 3 weeks to make it. Last year my group and I got recognized by the company (it wasn't Natura) because of the solution we created and with that with received a prize. 