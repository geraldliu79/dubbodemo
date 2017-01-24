package foo.bar;

import org.springframework.stereotype.Service;

/**
 * Copyright 2016 aichebaba. All rights reserved.
 * <p>
 * Package: foo.bar
 * FileName: HelloServiceImpl
 *
 * @author Jianing liu
 * @created 2016/8/4 000414:13
 * @last Modified
 * @history
 */

@Service
public class HelloServiceImpl implements HelloService {
    public String sayHello() {
        System.out.print("hello world 123");

        return "hello world 123";
    }
}
