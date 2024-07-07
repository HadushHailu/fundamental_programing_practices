package simple_formal_swing_framework;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().show();
            }
        });
    }
}
