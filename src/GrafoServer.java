import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;


import models.*;

import java.util.HashMap;

public class GrafoServer {

	public static ServerHandler handler;
	public static models.Operations.Processor processor;

	public static void main(String [] args){
		try{
			handler = new ServerHandler();
			processor = new models.Operations.Processor(handler);
			TServerTransport serverTransport = new TServerSocket(9090);
			TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));
			System.out.println("Starting Simple Server");
			server.serve();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
