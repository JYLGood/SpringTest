package com.yc.spring.test6_conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component      //@Service  @Repository  @Controller    -> IOC
@Conditional({SystemCondition.class})
public class NetConnection {
}
