
import org.apache.thrift.TException;
import java.util.HashMap;
import java.util.ArrayList;
import models.*;

public class ServerHandler implements models.Operations.Iface 
{
	private Grafo grafo = new Grafo(new ArrayList<Vertice>(),new ArrayList<Aresta>());

	public synchronized void salvaGrafo(String caminho){

	}

	public synchronized void carregaGrafo(String caminho){

	}


	public synchronized boolean addVertice(int nome, int cor, String descricao, double peso){
		return true;
	}


	public synchronized boolean addAresta(int v1, int v2, double peso, boolean direcao, String descricao){
		return true;
	}

	public synchronized boolean delVertice(int nome){
		return true;
	}

	public synchronized boolean delAresta(int v1, int v2){
		return true;
	}

	public synchronized boolean upVertice(int nomeUp, Vertice novoVertice){
		return true;
	}

	public synchronized boolean upAresta(int v1, int v2, Aresta novaAresta){
		return true;
	}
	
	public synchronized Vertice getVertice(int nome){
		return (new Vertice());
	}

	public synchronized Aresta getAresta(int v1, int v2, boolean flag){
		return (new Aresta());
	}

	public  String exibeGrafo(){
		return "oi";
	}

	public  String exibeVertice(boolean flag){
		return "oi";
	}

	public  String exibeAresta(boolean flag){
		return "oi";
	}

	public synchronized String listarArestasVertice(int nomeV, boolean flag){
		return "oi";
	}

	public synchronized String listarVizinhosVertice(int v){
		return "oi";
	}	
}
