/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hkt.com.javaswing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author MRG
 */
public class NewClass2 extends JFrame{
    protected JTable table;

    public NewClass2(){
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        NewClass1 tv = new NewClass1();
        table = new JTable(tv);
        pane.add(table, BorderLayout.CENTER);
    }

    public static void main(String [] args){
        NewClass2 stt = new NewClass2();
        stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stt.setSize(400, 200);
        stt.setVisible(true);
    }
}
