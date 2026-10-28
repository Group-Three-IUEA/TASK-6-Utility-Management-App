package PackageJPanels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ClassJPanels {
    JPanel ElectricityPanel, WaterPanel, WastePanel, ComplaintsPanel, BillingPanel;

    {
        ElectricityPanel = new JPanel();
        WaterPanel = new JPanel();
        WastePanel = new JPanel();
        ComplaintsPanel = new JPanel();
        BillingPanel = new JPanel();
    }

    public JPanel CustomizeElectricityPanel() {
        Border panelBorder = BorderFactory.createTitledBorder("Electricity Management");
        ElectricityPanel.setBorder(panelBorder);
        ElectricityPanel.add(new JLabel("Electricity Management Services"));
        ElectricityPanel.setLayout(new FlowLayout());
        return ElectricityPanel;
    }

    public JPanel CustomizeWaterPanel() {
        Border panelBorder = BorderFactory.createTitledBorder("Water Management");
        WaterPanel.setBorder(panelBorder);
        WaterPanel.add(new JLabel("Water Management Services"));
        WaterPanel.setLayout(new FlowLayout());
        return WaterPanel;
    }

    public JPanel CustomizeWastePanel() {
        Border panelBorder = BorderFactory.createTitledBorder("Waste Collection");
        WastePanel.setBorder(panelBorder);
        WastePanel.add(new JLabel("Waste Collection Services"));
        WastePanel.setLayout(new FlowLayout());
        return WastePanel;
    }

    public JPanel CustomizeComplaintsPanel() {
        Border panelBorder = BorderFactory.createTitledBorder("Customer Complaints");
        ComplaintsPanel.setBorder(panelBorder);
        ComplaintsPanel.add(new JLabel("Customer Complaints Services"));
        ComplaintsPanel.setLayout(new FlowLayout());
        return ComplaintsPanel;
    }

    public JPanel CustomizeBillingPanel() {
        Border panelBorder = BorderFactory.createTitledBorder("Billing Services");
        BillingPanel.setBorder(panelBorder);
        BillingPanel.add(new JLabel("Billing and Payment Services"));
        BillingPanel.setLayout(new FlowLayout());
        return BillingPanel;
    }
}
