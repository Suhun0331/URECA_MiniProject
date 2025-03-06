package org.example.m2swing.level1;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class L1Frame2 {

    private JFrame frm;

    public L1Frame2() {
        frm = new JFrame("제목은 여기에 쓰시면 됩니다.");
    }

    public void makeGui() {
        frm.setSize(500,500);
        frm.setVisible(true);
    }

    public void addEvent() {
        frm.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }//windowClosing
                }//WindowAdapter
        );//addWindowListener

    }

    public static void main(String[] args) {
        L1Frame test = new L1Frame();
        test.makeGui();
        test.addEvent();
    }
}
