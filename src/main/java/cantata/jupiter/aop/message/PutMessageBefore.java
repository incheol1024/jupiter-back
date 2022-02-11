package cantata.jupiter.aop.message;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class PutMessageBefore {


    @Around("@annotation(PutMessage)")
    public Object asyncSendMessage( ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("put message Test before");
        Object proceed = proceedingJoinPoint.proceed();
        log.info("put message Test after");

        return proceed;


    }
}
