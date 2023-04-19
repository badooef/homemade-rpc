package top.jialu.test;

import top.jialu.rpc.annotation.ServiceScan;
import top.jialu.rpc.serializer.CommonSerializer;
import top.jialu.rpc.transport.RpcServer;
import top.jialu.rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 * @author jialu
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
