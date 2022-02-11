package cantata.jupiter.kafka;

import cantata.jupiter.aop.message.PutMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AppRunner implements ApplicationRunner {

    @PutMessage(body = "run")
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("============test============");
        log.info("============test============");
        log.info("============test============");
    }


}
