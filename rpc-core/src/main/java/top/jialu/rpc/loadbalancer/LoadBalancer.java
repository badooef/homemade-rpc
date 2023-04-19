package top.jialu.rpc.loadbalancer;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;

/**
 * @author jialu
 */
public interface LoadBalancer {

    Instance select(List<Instance> instances);

}
