package microservices.book.gateway.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;

/**
 * @author moises.macero
 */
public class RibbonConfiguration {

    @Bean
    public IPing ribbonPing(final IClientConfig config) {
        // BOOT2: /health available under /actuator/health
        return new PingUrl(false,"/actuator/health");
    }

    @Bean
    public IRule ribbonRule(final IClientConfig config) {
        return new AvailabilityFilteringRule();
    }

}
