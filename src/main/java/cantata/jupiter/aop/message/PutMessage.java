package cantata.jupiter.aop.message;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PutMessage {

    String host() default "http://loalhost";

    String url() default "/default-log";

    String body();

    LogType logType() default LogType.DEFAULT_LOG;

    String value() default "";


}
