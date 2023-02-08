package org.codenest.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class ContentValidator implements Processor {


    @Override
    public void process(Exchange exchange) throws Exception {
        String body = exchange.getIn().getBody(String.class);

        if (body.contains("invalid")) {
            throw new IllegalStateException("I should not be invalid");
        }
    }
}
