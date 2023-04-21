package com.ebanma.cloud.webchat.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hgl
 * @version $ Id: config, v 0.1 2023/04/20 21:50 86139 Exp $
 */
@Component
@ConfigurationProperties(prefix = "netty")
@Data
public class NettyConfig {
    private int port;//netty监听的端口
    private String path;//websocket访问路径
}