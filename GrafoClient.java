import models.*;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;

import java.util.Scanner;

public class GrafoClient{
	public static void main(String [] args){
		try{
			TTransport transport = new TSocket("localhost",9090);
			transport.open();
		
			TProtocol protocol = new TBinaryProtocol(transport);
			models.Operations.Client client = new models.Operations.Client(protocol);
			int op = 0;
			Scanner leitura = new Scanner(System.in);
			while(op != 15)
			{
				op = 0;
				System.out.println("Bem-Vindo ao cliente do Grafos Server");
				System.out.println("O que você deseja fazer?");
				System.out.println("1 - Inserir vértice");
				System.out.println("2 - Inserir Aresta");
				System.out.println("3 - Deletar vértice");
				System.out.println("4 - Deletar Aresta");
				System.out.println("5 - Atualizar vértice");
				System.out.println("6 - Atualizar Aresta");
				System.out.println("7 - Exibir Grafo");
				System.out.println("8 - Exibir Vértices");
				System.out.println("9 - Exibir Arestas");
				System.out.println("10 - Exibir Arestas de um vértice");
				System.out.println("11 - Exibir vértices de uma aresta");
				System.out.println("12 - Exibir Vizinhança");
				System.out.println("13 - Salvar Grafo");
				System.out.println("14 - Carregar Grafo");
				System.out.println("15 - Encerrar");
				op = leitura.nextInt();
				switch(op){
					case 1:
						Vertice novo = new Vertice();
						System.out.println("Nome do vértice: ");
						novo.nome = leitura.nextInt();
						System.out.println("Peso: ");
						novo.peso = leitura.nextDouble();
						System.out.println("Descrição: ");
						leitura.nextLine();
						novo.descricao = leitura.nextLine();
						novo.cor = 1;
						if(!client.addVertice(novo.nome,novo.cor,novo.peso,novo.descricao))
							System.out.println("Ocorreu algum erro ao inserir seu vértice, tente novamente!");
						else
							System.out.println("vértice inserido com sucesso!");
						System.out.println("Tecle enter");
						leitura.nextLine();
						break;
					case 2:
						Aresta anovo = new Aresta();
						System.out.println("Primeiro Vértice: ");
						anovo.v1 = leitura.nextInt();
						System.out.println("Segundo Vértice: ");
						anovo.v2 = leitura.nextInt();
						System.out.println("Peso: ");
						anovo.peso = leitura.nextDouble();
						System.out.println("Descrição: ");
						leitura.nextLine();
						anovo.descricao = leitura.nextLine();
						System.out.println("1 - Direcionado(Do primeiro para o segundo), 2 - Bidirecionado");
						anovo.direcao = leitura.nextInt();
						if(!client.addAresta(anovo.v1,anovo.v2,anovo.peso,anovo.direcao,anovo.descricao))
							System.out.println("Ocorreu algum erro ao inserir sua aresta, tente novamente!");
						else
							System.out.println("Aresta inserida com sucesso!");
						System.out.println("Tecle enter");
						leitura.nextLine();
						break;
					case 3:
						int del;
						System.out.println(client.exibeVertice());
						System.out.println("Digite o nome do vertice que deseja deletar: ");
						del = leitura.nextInt();
						if(!client.delVertice(del))
							System.out.println("Impossível encontrar o elemento desejado!!!");
						else
							System.out.println("Elemento removido com sucesso!");
						break;
					case 4:
						int del2;
						int del1;
						System.out.println(client.exibeAresta());
						System.out.println("Digite os vertices da aresta que deseja deletar: ");
						del1 = leitura.nextInt();
						del2 = leitura.nextInt();
						if(!client.delAresta(del1,del2))
							System.out.println("Impossível encontrar o elemento desejado!!!");
						else
							System.out.println("Elemento removido com sucesso!");
						break;
					case 5:
						System.out.println(client.exibeVertice());
						Vertice novou = new Vertice();
						System.out.println("Digite o nome do vértice que será atualizado: ");
						novou.nome = leitura.nextInt();
						System.out.println("Peso: ");
						novou.peso = leitura.nextDouble();
						System.out.println("Descrição: ");
						leitura.nextLine();
						novou.descricao = leitura.nextLine();
						novou.cor = 1;
						if(!client.upVertice(novou,novou.nome))
							System.out.println("Falha ao realizar atualização, vertice não encontrado!");
						else
							System.out.println("Atualizado com sucesso");
						System.out.println("Tecle enter");
						leitura.nextLine();
						break;
					case 6:
						Aresta anovou = new Aresta();
						System.out.println("Primeiro Vértice da aresta que será modificada: ");
						anovou.v1 = leitura.nextInt();
						System.out.println("Segundo Vértice da aresta que será modificada:: ");
						anovou.v2 = leitura.nextInt();
						System.out.println("Peso: ");
						anovou.peso = leitura.nextDouble();
						System.out.println("Descrição: ");
						leitura.nextLine();
						anovou.descricao = leitura.nextLine();
						System.out.println("1 - Direcionado(Do primeiro para o segundo), 2 - Bidirecionado");
						anovou.direcao = leitura.nextInt();
						if(!client.upAresta(anovou.v1,anovou.v2,anovou))
							System.out.println("Falha ao realizar atualização, aresta não encontrada!");
						else
							System.out.println("Atualizado com sucesso");
						System.out.println("Tecle enter");
						leitura.nextLine();
						System.out.println(client.exibeAresta());
						break;
					case 7:
						System.out.println(client.exibeGrafo());
						try {
							Thread.sleep(5000);
						}catch (InterruptedException e){
							e.printStackTrace();
						}
						break;
					case 8:
						System.out.println(client.exibeVertice());
						try {
							Thread.sleep(5000);
						}catch (InterruptedException e){
							e.printStackTrace();
						}
						break;
					case 9:
						System.out.println(client.exibeAresta());
						try {
							Thread.sleep(5000);
						}catch (InterruptedException e){
							e.printStackTrace();
						}
						break;
					case 10:
						System.out.println("Digite o nome do vértice: ");
						int nvertice = leitura.nextInt();
						System.out.println(client.listarArestasVertice(nvertice));
						break;
					case 11:
						System.out.println("Digite o nome do vértice1: ");
						int nvertice1 = leitura.nextInt();
						System.out.println("Digite o nome do vértice2: ");
						int nvertice2 = leitura.nextInt();
						System.out.println(client.listarVerticeAresta(nvertice1,nvertice2));
						break;
					case 12:
						System.out.println("Digite o vértice que deseja conferir os vizinhos: ");
						int vi = leitura.nextInt();
						System.out.println(client.listarVizinhosVertice(vi));
						try {
							Thread.sleep(5000);
						}catch (InterruptedException e){
							e.printStackTrace();
						}
						break;
					case 13:
						System.out.println("Digite o nome do arquivo para salvar o grafo: ");
						leitura.nextLine();
						String arquivo = leitura.nextLine();
						client.salvaGrafo(arquivo);
						break;
					case 14:
						System.out.println("Digite o nome do arquivo para abrir o grafo: ");
						leitura.nextLine();
						String abrir = leitura.nextLine();
						client.carregaGrafo(abrir);
						break;
					case 15:
						System.out.println("Programando encerrado.");
						break;
					default:
						System.out.println("Opção inválida!");
						break;
				}

			}
			transport.close();
		}catch (TException x){
			x.printStackTrace();
		}
	}
}	
