package com.junfeng.demowebsocket.client;

import com.junfeng.demowebsocket.server.WebSocketServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author junfeng
 * @Classname ClientController
 * @Description 客户端
 * @Date 2022-05-16
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/client")
public class ClientController {

    @GetMapping
    public String hello(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String date = dateFormat.format(new Date());
        WebSocketServer.sendInfo(msg+"~~~"+date,"10");
        return "ok";
    }



}
