package org.example;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App 
{
    @SneakyThrows
    public static void main( String[] args )
    {
        for (int i = 0; i < 12; ++i) {
            log.info("Hello World");
            Thread.sleep(10*1000);
        }
    }
}
