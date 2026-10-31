package PackageJTabbedPanes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class ClassJTabbedPanesTest {

    private JTabbedPane tabs;
    private ClassUtilityFrame utilityFrame;

    private static final String[] TITLES =
            {"Electricity", "Water", "Waste Collection", "Complaints", "Billing"};

    private static final String[] LABELS = {
            "Electricity Management Services",
            "Water Management Services",
            "Waste Collection Services",
            "Customer Complaints Services",
            "Billing and Payment Services"};

    private static final String[] BORDERS = {
            "Electricity Management",
            "Water Management",
            "Waste Collection",
            "Customer Complaints",
            "Billing Services"};

    @BeforeEach
    void setUp() {
        // new object every time, because CustomizeJTabbedPane() adds tabs each call
        tabs = new ClassJTabbedPanes().CustomizeJTabbedPane();
    }

    @AfterEach
    void tearDown() {
        if (utilityFrame != null) {
            utilityFrame.JTabbedFrame.dispose();
        }
    }

    // ---------- Tabbed pane tests ----------

    @Test
    void hasFiveTabs() {
        assertEquals(5, tabs.getTabCount());
    }

    @Test
    void tabTitlesAreInCorrectOrder() {
        for (int i = 0; i < TITLES.length; i++) {
            assertEquals(TITLES[i], tabs.getTitleAt(i));
        }
    }

    @Test
    void firstTabIsSelectedByDefault() {
        assertEquals(0, tabs.getSelectedIndex());
        assertEquals("Electricity", tabs.getTitleAt(tabs.getSelectedIndex()));
    }

    @Test
    void canSwitchToEveryTab() {
        for (int i = 0; i < tabs.getTabCount(); i++) {
            tabs.setSelectedIndex(i);
            assertEquals(i, tabs.getSelectedIndex());
            assertEquals(TITLES[i], tabs.getTitleAt(tabs.getSelectedIndex()));
        }
    }

    @Test
    void eachTabHasItsOwnPanel() {
        for (int i = 0; i < tabs.getTabCount(); i++) {
            assertInstanceOf(JPanel.class, tabs.getComponentAt(i));
        }
        assertNotSame(tabs.getComponentAt(0), tabs.getComponentAt(1));
    }

    @Test
    void eachPanelShowsCorrectLabel() {
        for (int i = 0; i < tabs.getTabCount(); i++) {
            JPanel panel = (JPanel) tabs.getComponentAt(i);
            JLabel label = (JLabel) panel.getComponent(0);
            assertEquals(LABELS[i], label.getText());
        }
    }

    @Test
    void eachPanelHasCorrectTitledBorder() {
        for (int i = 0; i < tabs.getTabCount(); i++) {
            JPanel panel = (JPanel) tabs.getComponentAt(i);
            assertInstanceOf(TitledBorder.class, panel.getBorder());
            assertEquals(BORDERS[i], ((TitledBorder) panel.getBorder()).getTitle());
        }
    }

    @Test
    void invalidTabIndexThrowsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> tabs.setSelectedIndex(10));
    }

    // ---------- Frame tests ----------

    private void createFrame() throws Exception {
        SwingUtilities.invokeAndWait(() -> utilityFrame = new ClassUtilityFrame());
    }

    @Test
    void frameHasCorrectTitle() throws Exception {
        createFrame();
        assertEquals("Public Utility Management System", utilityFrame.JTabbedFrame.getTitle());
    }

    @Test
    void frameIsVisibleAndCorrectSize() throws Exception {
        createFrame();
        assertTrue(utilityFrame.JTabbedFrame.isVisible());
        assertEquals(700, utilityFrame.JTabbedFrame.getWidth());
        assertEquals(450, utilityFrame.JTabbedFrame.getHeight());
    }

    @Test
    void frameExitsOnClose() throws Exception {
        createFrame();
        assertEquals(JFrame.EXIT_ON_CLOSE, utilityFrame.JTabbedFrame.getDefaultCloseOperation());
    }

    @Test
    void frameContainsTabbedPaneWithFiveTabs() throws Exception {
        createFrame();
        Component c = utilityFrame.JTabbedFrame.getContentPane().getComponent(0);
        assertInstanceOf(JTabbedPane.class, c);
        assertEquals(5, ((JTabbedPane) c).getTabCount());
    }
}