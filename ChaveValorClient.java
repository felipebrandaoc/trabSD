
import models.*;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;

public class ChaveValorClient {
  public static void main(String [] args) {
    try {
      TTransport transport = new TSocket("localhost", 9090);
      transport.open();

      TProtocol protocol = new  TBinaryProtocol(transport);
      ChaveValor.Client client = new ChaveValor.Client(protocol);

      int k1 = 1;
      String v1 = "lalaal";

      client.setKV(k1,v1);
      System.out.println(client.getKV(k1));
      client.delKV(k1);

      System.out.println(client.getKV(k1));

      transport.close();
    } catch (TException x) {
      x.printStackTrace();
    } 
  }
}
