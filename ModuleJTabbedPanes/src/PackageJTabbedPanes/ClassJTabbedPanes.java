package PackageJTabbedPanes;

import javax.swing.*;
import PackageJPanels.ClassJPanels;

public class ClassJTabbedPanes {
    JTabbedPane JTabbedPaneOne;
    ClassJPanels CJP;

    {
        JTabbedPaneOne = new JTabbedPane();
        CJP = new ClassJPanels();
    }

    public JTabbedPane CustomizeJTabbedPane() {
        JTabbedPaneOne.addTab("Electricity", CJP.CustomizeElectricityPanel());
        JTabbedPaneOne.addTab("Water", CJP.CustomizeWaterPanel());
        JTabbedPaneOne.addTab("Waste Collection", CJP.CustomizeWastePanel());
        JTabbedPaneOne.addTab("Complaints", CJP.CustomizeComplaintsPanel());
        JTabbedPaneOne.addTab("Billing", CJP.CustomizeBillingPanel());
        return JTabbedPaneOne;
    }
}
