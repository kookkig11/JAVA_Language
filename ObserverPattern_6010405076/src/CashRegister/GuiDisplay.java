package CashRegister;

import javax.swing.*;

public class GuiDisplay implements Observer{
    private float total;

    private JFrame frame;
    private JTextArea area;

    public GuiDisplay() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Total Purchase");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        area = new JTextArea(150, 150);
        frame.add(area);
        area.setText(" <<  Total Purchase  >> \n");
    }


    @Override
    public void update(float purchase) {
        this.total += purchase;
        area.setText("total: " + total);
    }
}
