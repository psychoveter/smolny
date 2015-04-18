package ttt.view;

import ttt.controller.TTTController;
import ttt.model.TTTModel;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by veter on 18.04.15.
 */
public class TTTPanel extends JPanel implements MouseListener {

    private TTTModel model;
    private TTTController controller;

    public TTTPanel() {
        //you need your specific mouse listener (extends MouseAdapter)
        addMouseListener(this);

    }

    public void update() {
        //redraw from model
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
