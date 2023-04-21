package com.ebanma.cloud.webchat.netty;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hgl
 * @version $ Id: NettyController, v 0.1 2023/04/20 22:13 86139 Exp $
 */
@Controller
public class NettyController {

    @GetMapping("/index.html")
    public String chat() {
        return "chat";
    }
    @GetMapping("/")
    public String index() {
        return "chat";
    }
}
