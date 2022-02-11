package cantata.jupiter.aop.message;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Optional;

@Aspect
@Component
@Order(0)
@Slf4j
public class PutMessageBefore {


    @Before(value = "@annotation(cantata.jupiter.aop.message.PutMessage)")
    public void asyncSendMessage(JoinPoint joinPoint) throws Throwable {
        log.info("put message Test before");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        // 이미 PutMessage 애너테이션이 존재하는 것을 Aspect 하므로 아래 putMessage는 null이 될 수 없음
        PutMessage putMessage = signature.getMethod().getAnnotation(PutMessage.class);

        String endPoint = putMessage.host().concat(putMessage.url());
        String body = putMessage.body();
        String logType = putMessage.logType().name();

    }
}
