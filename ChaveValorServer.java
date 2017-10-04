package chavevalor;

import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;

// Generated code
import chavevalor.*;

import java.util.HashMap;

public class ChaveValorServer {

  public static ChaveValorHandler handler;

  public static ChaveValor.Processor processor;

  public static void main(String [] args) {
    try {
      handler = new ChaveValorHandler();
      processor = new ChaveValor.Processor(handler);

      TServerTransport serverTransport = new TServerSocket(9090);
      TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));

      System.out.println("Starting the simple server...");
      server.serve();

    } catch (Exception x) 
    {
      x.printStackTrace();
    }
  }
}
