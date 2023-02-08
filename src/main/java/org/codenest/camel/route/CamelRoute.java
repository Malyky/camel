package org.codenest.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static org.apache.camel.builder.endpoint.StaticEndpointBuilders.timer;

@Component
public class CamelRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from(timer("mytimer").period(1000))
                .log("test")
                ;
    }
}
