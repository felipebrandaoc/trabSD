namespace java models

struct Vertice {
	1:i32 nome,
	2:i32 cor,
	3:string descricao,
	4:double peso,
}

struct Aresta {
	1:i32 v1,
	2:i32 v2,
	3:double peso,
	4:i32 direcao,
	5:string descricao	
}

struct Grafo{
	1:list<Vertice> v,
	2:list<Aresta> a
}

service Operations{
    void carregaGrafo(1:string caminho),
    void salvaGrafo(1:string caminho),
    bool addVertice(1:i32 nome,2:i32 cor,3:double peso, 4:string descricao),
    bool addAresta(1:i32 v1,2:i32 v2,3:double peso,4:i32 direcao,5:string descricao),
    bool delVertice(1:i32 nome),
    bool delAresta(1:i32 v1,2:i32 v2),
    bool upVertice(1:Vertice V, 2:i32 nomeUp),
    bool upAresta(1:i32 nomeV1, 2:i32 nomeV2, 3:Aresta A),
    Vertice getVertice(1:i32 nome),
    Aresta getAresta(1:i32 v1,2:i32 v2,3:i32 direcao),
    string exibeGrafo(),
    string exibeVertice(),
    string exibeAresta(),
    string listarArestasVertice(1:i32 nomeV),
    string listarVerticeAresta(1:i32 v1,2:i32 v2),
    string listarVizinhosVertice(1:i32 nomeV),
}



