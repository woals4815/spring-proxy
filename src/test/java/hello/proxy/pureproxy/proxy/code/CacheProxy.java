package hello.proxy.pureproxy.proxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CacheProxy implements Subject {

    // 실제 객체이고 프록시가 호출해야 하는 대
    private Subject target;
    //cache 되는 값
    private String cacheValue;

    public CacheProxy(Subject target) {
        this.target = target;
    }

    @Override
    public String operation() {
        log.info("call proxy");
        if (cacheValue == null) cacheValue = target.operation();

        return cacheValue;
    }
}
