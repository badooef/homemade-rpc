package top.jialu.rpc.transport;

import top.jialu.rpc.serializer.CommonSerializer;

/**
 * 服务器类通用接口
 *
 * @author jialu
 */
public interface RpcServer {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    void start();

    <T> void publishService(T service, String serviceName);

}
