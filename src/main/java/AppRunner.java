import cantata.jupiter.aop.message.PutMessage;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
            this.tester();
    }

    @PutMessage
    public Object tester() {
        return new Object();
    }


}
