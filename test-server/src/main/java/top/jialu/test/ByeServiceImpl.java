package top.jialu.test;

import top.jialu.rpc.annotation.Service;
import top.jialu.rpc.api.ByeService;

/**
 * @author jialu
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
