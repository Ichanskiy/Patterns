package com.proxy.virtual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Main {

    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD");
    JMenuBar menuBar;
    JMenu menu;
    private Map<String, String> cds = new HashMap<>();

    public static void main(String[] args) throws MalformedURLException {
        Main main = new Main();
    }

    public Main() throws MalformedURLException {
        cds.put("tes", "https://wallpaperbrowse.com/media/images/3848765-wallpaper-images-download.jpg");

        URL initURL = new URL(cds.get("tes"));
        menuBar = new JMenuBar();
        menu = new JMenu("Menus");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (String s : cds.keySet()) {
            JMenuItem menuItem = new JMenuItem(s);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        Icon icon = new ImageProxy(initURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getUrl(String name) {
        try {
            return new URL(cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
