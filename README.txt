IMPLEMENTING TABS — MODULAR JAVA SWING PROJECT
================================================

This project follows the module and package structure used in Advanced.zip.

PROJECT STRUCTURE
-----------------
ModuleJPanels
  src
    module-info.java
    PackageJPanels
      ClassJPanels.java

ModuleJTabbedPanes
  src
    module-info.java
    PackageJTabbedPanes
      ClassJTabbedPanes.java
      ClassUtilityFrame.java

WHAT THE PROGRAM DOES
---------------------
The application displays five tabs:
1. Electricity
2. Water
3. Waste Collection
4. Complaints
5. Billing

HOW THE MODULES WORK
--------------------
- ModuleJPanels contains the five panels and their labels.
- ModuleJTabbedPanes creates the JTabbedPane and the application window.
- PackageJPanels and PackageJTabbedPanes organize the Java classes.
- module-info.java declares the modules and their dependency.

HOW TO OPEN AND RUN
-------------------
1. Extract this ZIP file.
2. Open the extracted UtilityTabs_Modular folder as a project in IntelliJ IDEA.
3. Add both ModuleJPanels and ModuleJTabbedPanes as modules in the project.
4. Ensure ModuleJTabbedPanes depends on ModuleJPanels.
5. Run PackageJTabbedPanes.ClassUtilityFrame.

If your IDE asks for a project SDK, select an installed JDK.

NOTE
----
This is a basic tab demonstration, matching the simple style of the supplied
Advanced.zip. Each panel can later be expanded with forms, buttons, and tables.
