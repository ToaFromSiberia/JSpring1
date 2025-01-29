package com.junior;

import com.junior.controller.Server;
import com.junior.view.ViewSwing;

import javax.swing.*;


public class App
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Server server = new Server(new ViewSwing());
            }
        });
    }
}
