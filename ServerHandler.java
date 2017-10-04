

/**
 * Criado por Felipe Brandão.
 */

import org.apache.thrift.TException;
import java.util.HashMap;
import java.util.ArrayList;
import models.*;
import org.apache.thrift.TException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ServerHandler implements models.Operations.Iface 
{
	private Grafo grafo = new Grafo(new ArrayList<Vertice>(),new ArrayList<Aresta>());

	//Salva Grafo em Arquivo
	public synchronized void salvaGrafo(String path)
	{
        try
        {
            FileOutputStream saveFile = new FileOutputStream(path);
            ObjectOutputStream stream = new ObjectOutputStream(saveFile);
            //Salva o Objeto
            stream.writeObject((Object)grafo);
            stream.close();
        } catch (Exception exc)
        {
            exc.printStackTrace();
        }
	}

    //Recupera Grafo de Arquivo
	public synchronized void carregaGrafo(String path)
	{
        Object objeto = null;
        try {
            FileInputStream restFile = new FileInputStream(path);
            ObjectInputStream stream = new ObjectInputStream(restFile);
            //Recupera o objeto
            objeto = stream.readObject();
            if(objeto != null)
                grafo = (Grafo)objeto;
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

    //Adiciona Vértice com dadas informações ao Grafo
	public synchronized boolean addVertice(int nome, int cor, double peso,  String descricao)
	{
        Vertice novo = new Vertice();
        if(novo == null)//O Vértice foi criado?
            return false;
        else {
            if(grafo.getV().isEmpty()) {
                novo.nome = nome;
                novo.cor = cor;
                novo.peso = peso;
                novo.descricao = descricao;
                grafo.addToV(novo);
                return true;
            }
            else {
                for (Vertice ve : grafo.getV()) {
                    if (ve.nome == nome) //Não aceita vértices com mesmo nome
                        return false;
                }
                novo.nome = nome;
                novo.cor = cor;
                novo.peso = peso;
                novo.descricao = descricao;
                grafo.addToV(novo);
                return true;
            }
        }
	}

    //Adiciona Aresta com dadas informações ao Grafo
	public synchronized boolean addAresta(int v1, int v2, double peso, boolean direcao, String descricao)
	{
        int ctrl = 0;
        Aresta novo = new Aresta();
        if (novo != null) {
            for(Vertice v : grafo.getV() ){
                if(v.nome == v1 || v.nome == v2) //Os vértices existem?
                    ctrl++;
            }
            if(ctrl != 2)
                return false; //exception de vértices não existem.
            else{
                if(grafo.getA().isEmpty())
                {
                    novo.v1 = v1;
                    novo.v2 = v2;
                    novo.peso = peso;
                    novo.direcao = direcao;
                    novo.descricao = descricao;
                    if(novo.direcao == 2){
                        grafo.addToA(new Aresta(novo.v2,novo.v1,novo.peso,novo.direcao,novo.descricao));
                    }
                    grafo.addToA(novo);
                    return true;
                }
                else {
                    for (Aresta as : grafo.getA()) {
                        if (as.v1 == v1 && as.v2 == v2)
                            return false; //exception de já existe uma aresta ligando esses vértices
                    }
                    novo.v1 = v1;
                    novo.v2 = v2;
                    novo.peso = peso;
                    novo.direcao = direcao;
                    novo.descricao = descricao;
                    if(novo.direcao == 2){
                        grafo.addToA(new Aresta(novo.v2,novo.v1,novo.peso,novo.direcao,novo.descricao));
                    }
                    grafo.addToA(novo);
                    return true;
                }
            }
        }
        else
            return false;
	}

    //Remove Vértice do Grafo
	public synchronized boolean delVertice(int nome)
	{
        //Verifica se o vértice existe
        for(Vertice V : grafo.getV())
        {
            if(V.nome == nome){
                //Removendo arestas ligadas ao Vértice
                for(int i=grafo.getA().size()-1; i >= 0;i--) {
                    if(grafo.getA().get(i).v1 == nome || grafo.getA().get(i).v2 == nome)
                    {
                        grafo.a.remove(i);
                        if(grafo.getA().isEmpty()) {
                            break;
                        }
                    }
                }
                //Removendo o vértice
                grafo.getV().remove(V);
                return true;
            }
        }
        return false; //Vértice não encontrado
	}

    //Remove Aresta do Grafo
	public synchronized boolean delAresta(int v1, int v2)
	{
        for(Aresta as : grafo.getA())
        {
            if(as.v1 == v1 && as.v2 == v2)
            {
                //Aresta encontrada e removida
                grafo.getA().remove(as);
                return true; // tudo ok
            }
        }
        return false; //Aresta não encontrada
	}


	public synchronized boolean upVertice(Vertice novoVertice,int nomeUp)
	{
        if(novoVertice == null || novoVertice.nome != nomeUp)
            return false; //novo vértice nullo ou com nome diferente do vértice buscado, gera excepetion (vértices não podem ter o nome modificado).
        for(Vertice vs : grafo.getV())
        {
            if(vs.nome == nomeUp)
            {
                vs.descricao = novoVertice.descricao;
                vs.cor = novoVertice.cor;
                vs.peso = novoVertice.peso;
                return true; //Alteração Concluída
            }
        }
        return false; //Vértice não Encontrado
	}

	public synchronized boolean upAresta(int v1, int v2, Aresta novaAresta)
	{
        if(novaAresta == null || novaAresta.v1 != v1 || novaAresta.v2 != v2)
            return false; //tentou modificar vértices da aresta ou passou uma aresta nova nula.
        for(Aresta as : grafo.getA())
        {
            //Aresta encontrada
            if(as.v1 == v1 && as.v2 == v2)
            {
                as.descricao = novaAresta.descricao;
                as.peso = novaAresta.peso;
                if(novaAresta.direcao == 2 && as.direcao != 2){
                    Aresta novo = new Aresta(novaAresta.v2,novaAresta.v1,novaAresta.peso,novaAresta.direcao,novaAresta.descricao);
                    grafo.addToA(novo);
                }
                as.direcao = novaAresta.direcao;
                return true; //Modificação Concluída
            }
        }
        return false; //Aresta não foi Encontrada

	}
	
	//Recupera Vértice pelo nome
	public synchronized Vertice getVertice(int nome){

        for(Vertice v: grafo.getV())
        {
            if(v.nome == nome) {
                System.out.println( "Vértice: " + v.nome + " " +
                        "Cor: " + getCores(v.cor) + " " +
                        "Peso: " + v.peso + " " +
                        "Descrição: " + v.descricao + "\n");
                return v;
            }
        }
        //Cliente: Quais valores estão no vertice y
        return null;
	}

    //Recupera aresta dados seus vértices
	public synchronized Aresta getAresta(int v1, int v2, int direcao){


        for(Aresta v: grafo.getA())
        {
            if(v.v1 == v1 && v.v2 == v2)
                System.out.println( "Vértice 1: "+ v.v1 +" "+
                        "Vértice 2: "+v.v2 +" "+
                        "Peso: "+ v.peso + " "+
                        "Descrição: "+ v.descricao+ "\n");
            return v;
        }
        //Cliente: Quais valores estão na aresta X
        return null;
	}

	//Mostra as informações que constituem o Grafo
	public  String exibeGrafo()
    {
        String msg = "Seu grafo: \n";
        msg = msg + exibeVertice();
        msg = msg +exibeAresta();
        return msg;
	}

    //Mostra Vértice
	public  String exibeVertice()
    {
        String s = "vértices: \n";
        for(Vertice v: grafo.getV())
        {
            s = s+ "Vértice: "+ v.nome +" "+
                    "Cor: "+getCores(v.cor) +" "+
                    "Peso: "+ v.peso + " "+
                    "Descrição: "+ v.descricao+ "\n";
        }
        return s;
	}

	//Mostra Aresta
	public  String exibeAresta()
    {
        String s = "Arestas: \n";
        for(Aresta v: grafo.getA())
        {
            s = s+ "Vértice 1: "+ v.v1 +" "+
                    "Vértice 2: "+v.v2 +" "+
                    "Peso: "+ v.peso + " "+
                    "Flag: "+ v.direcao + " "+
                    "Descrição: "+ v.descricao+ "\n";
        }
        return s;
	}

	//Lista Arestas-Vertice
    @Override
	public synchronized String listarArestasVertice(int nomeV)
    {
        String s = "Arestas do vértice :"+nomeV+"\n";
        for(Aresta as : grafo.getA())
        {
            if(as.v1 == nomeV || as.v2 == nomeV)
                s = s+ "Vértice 1: "+ as.v1 +" "+
                        "Vértice 2: "+as.v2 +" "+
                        "Peso: "+ as.peso + " "+
                        "Flag: "+ as.direcao + " "+
                        "Descrição: "+ as.descricao+ "\n";
        }
        return s;
	}


    public synchronized String listarVerticeAresta(int v1, int v2)
    {
        String s = "Vértices da aresta desejada: \n";
        for(Vertice v: grafo.getV())
        {
            if(v.nome == v1 || v.nome == v2) {
                s = s + "Vértice: " + v.nome + " " +
                        "Cor: " + getCores(v.cor) + " " +
                        "Peso: " + v.peso + " " +
                        "Descrição: " + v.descricao + "\n";
            }
        }
        return s;
    }


	//Lista Vizinhos de um Vértice
	public synchronized String listarVizinhosVertice(int nome)
    {
        String s = "Os vértices vizinhos de :"+nome+" são: \n";

        for (Aresta as : grafo.getA())
        {
            if(as.v1 == nome)
            {
                Vertice v = getVertice(as.v2);
                s = s+ "Vértice: "+ v.nome +" "+
                        "Cor: "+getCores(v.cor) +" "+
                        "Peso: "+ v.peso + " "+
                        "Descrição: "+ v.descricao+ "\n";
            }
            else if(as.v2 == nome)
            {
                Vertice v = getVertice(as.v1);
                s = s+ "Vértice: "+ v.nome +" "+
                        "Cor: "+getCores(v.cor) +" "+
                        "Peso: "+ v.peso + " "+
                        "Descrição: "+ v.descricao+ "\n";
            }
        }
        return s;
	}

    public String getCores(int cor)
    {
        return "azul";
    }


}
