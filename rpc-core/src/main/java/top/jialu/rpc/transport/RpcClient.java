package top.jialu.rpc.transport;

import top.jialu.rpc.entity.RpcRequest;
import top.jialu.rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 *
 * @author jialu
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
