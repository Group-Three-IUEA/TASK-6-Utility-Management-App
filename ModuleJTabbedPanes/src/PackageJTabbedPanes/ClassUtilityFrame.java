package PackageJTabbedPanes;

import javax.swing.*;
import java.awt.*;

public class ClassUtilityFrame {
    JFrame JTabbedFrame;
    ClassJTabbedPanes CJTP;

    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JTabbedFrame = new JFrame("Public Utility Management System");
        CJTP = new ClassJTabbedPanes();
    }

    public ClassUtilityFrame() {
        CustomizeJTabbedFrame();
    }

    public void CustomizeJTabbedFrame() {
        JTabbedFrame.setSize(700, 450);
        JTabbedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedFrame.setLayout(new GridLayout(1, 1));
        JTabbedFrame.add(CJTP.CustomizeJTabbedPane());
        JTabbedFrame.setLocationRelativeTo(null);
        JTabbedFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new ClassUtilityFrame();
    }
}
