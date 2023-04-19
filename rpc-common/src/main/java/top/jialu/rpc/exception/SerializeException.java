package top.jialu.rpc.exception;

/**
 * 序列化异常
 *
 * @author jialu
 */
public class SerializeException extends RuntimeException {
    public SerializeException(String msg) {
        super(msg);
    }
}
