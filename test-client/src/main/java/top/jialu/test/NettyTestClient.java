package top.jialu.test;

import top.jialu.rpc.api.ByeService;
import top.jialu.rpc.api.HelloObject;
import top.jialu.rpc.api.HelloService;
import top.jialu.rpc.serializer.CommonSerializer;
import top.jialu.rpc.transport.RpcClient;
import top.jialu.rpc.transport.RpcClientProxy;
import top.jialu.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 * @author jialu
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res+"1111");
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
