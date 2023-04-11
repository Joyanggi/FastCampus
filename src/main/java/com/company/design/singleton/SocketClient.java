package com.company.design.singleton;

import java.sql.SQLOutput;

public class SocketClient {
    private static SocketClient socketClient = null;  // 싱글톤은 자기 자신을 객체로 가지고 있어야한다.

    private SocketClient(){ // 싱글톤은 기본생성자를 private로 막아야한다.

    }

    public static SocketClient getInstance(){   // static 메서드로 getInstance를 제공해야한다.
        if(socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
