package top.jialu.test;

import top.jialu.rpc.annotation.ServiceScan;
import top.jialu.rpc.serializer.CommonSerializer;
import top.jialu.rpc.transport.RpcServer;
import top.jialu.rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 * @author jialu
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
