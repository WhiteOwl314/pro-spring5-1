package com.apress.prospring5.ch3.annotated;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    //Value 를 통해서 message값을 주입
    @Autowired
    public ConfigurableMessageProvider(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
