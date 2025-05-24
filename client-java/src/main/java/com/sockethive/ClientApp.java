package com.sockethive;

import io.socket.client.IO;
import io.socket.client.Socket;

import java.net.URISyntaxException;

public class ClientApp {

    public static void main(String[] args) throws URISyntaxException {

        Socket socket = IO.socket("http://localhost:3000/client");


        socket.connect();
    }
}
