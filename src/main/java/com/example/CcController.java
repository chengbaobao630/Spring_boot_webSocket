package com.example;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by cheng on 2016/7/3 0003.
 */
@Controller
public class CcController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public CcResponse say(CcMessage message)throws  Exception{
        Thread.sleep(3000);
        return new CcResponse("welcome,"+message.getName()+"!");
    }



}
