package org.example.m2swing.level1;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class L1Frame4 {

    private JFrame frm;
    private WindowEventProcessor winEventProc;

    public L1Frame4() {
        frm = new JFrame("제목은 여기에 쓰시면 됩니다.");
        winEventProc = new WindowEventProcessor();
    }

    public void makeGui() {
        frm.setSize(500,500);
        frm.setVisible(true);
    }

    public void addEvent() {
        frm.addWindowListener(winEventProc);

    }//addEvent

    public static void main(String[] args) {
        L1Frame4 test = new L1Frame4();
        test.makeGui();
        test.addEvent();
    }
}
