package com.willwinder.ugp.welcome;

import java.awt.Color;
import javax.swing.UIManager;
import org.openide.modules.OnStart;

@OnStart
public final class FlkThemeInstaller implements Runnable {
    
    @Override
public void run() {

    // ============================
    // PALETTE FABLAB EN KIT
    // ============================

    Color background = Color.decode("#181b24");
    Color panel = Color.decode("#222634");
    Color panelLight = Color.decode("#292e3d");

    Color blue = Color.decode("#262e60");
    Color orange = Color.decode("#ffa243");

    Color text = Color.decode("#f2f2f2");
    Color mutedText = Color.decode("#b8bcc8");
    Color border = Color.decode("#343948");


    // ============================
    // FOND GENERAL
    // ============================

    UIManager.put("RootPane.background", background);
    UIManager.put("RootPane.foreground", text);

    UIManager.put("Desktop.background", background);
    UIManager.put("Nb.EmptyEditorArea.background", background);

    UIManager.put("Panel.background", panel);
    UIManager.put("Panel.foreground", text);


    // ============================
    // BARRE DE TITRE WINDOWS
    // ============================

    UIManager.put("TitlePane.background", background);
    UIManager.put("TitlePane.inactiveBackground", background);

    UIManager.put("TitlePane.foreground", text);
    UIManager.put("TitlePane.embeddedForeground", text);
    UIManager.put("TitlePane.inactiveForeground", mutedText);

    UIManager.put("TitlePane.borderColor", border);

    UIManager.put("TitlePane.buttonHoverBackground", panelLight);
    UIManager.put("TitlePane.buttonPressedBackground", blue);


    // ============================
    // MENU SUPERIEUR
    // ============================

    UIManager.put("MenuBar.background", background);
    UIManager.put("MenuBar.foreground", text);

    UIManager.put("Menu.foreground", text);
    UIManager.put("Menu.selectionForeground", text);
    UIManager.put("Menu.selectionBackground", blue);

    UIManager.put("MenuItem.background", panel);
    UIManager.put("MenuItem.foreground", text);
    UIManager.put("MenuItem.selectionBackground", blue);
    UIManager.put("MenuItem.selectionForeground", text);

    UIManager.put("PopupMenu.background", panel);
    UIManager.put("PopupMenu.foreground", text);


    // ============================
    // BARRES D'OUTILS
    // ============================

    UIManager.put("ToolBar.background", background);
    UIManager.put("ToolBar.foreground", text);

    UIManager.put("Separator.foreground", border);


    // ============================
    // ONGLETS NETBEANS
    // ============================

    UIManager.put("EditorTab.background", panel);
    UIManager.put("EditorTab.foreground", text);

    UIManager.put("EditorTab.activeBackground", panelLight);
    UIManager.put("EditorTab.activeForeground", text);

    UIManager.put("EditorTab.selectedBackground", panel);
    UIManager.put("EditorTab.selectedForeground", text);

    UIManager.put("EditorTab.hoverBackground", blue);
    UIManager.put("EditorTab.hoverForeground", text);

    UIManager.put("EditorTab.underlineColor", orange);


    UIManager.put("ViewTab.background", panel);
    UIManager.put("ViewTab.foreground", text);

    UIManager.put("ViewTab.activeBackground", panelLight);
    UIManager.put("ViewTab.activeForeground", text);

    UIManager.put("ViewTab.selectedBackground", panel);
    UIManager.put("ViewTab.selectedForeground", text);

    UIManager.put("ViewTab.hoverBackground", blue);
    UIManager.put("ViewTab.hoverForeground", text);

    UIManager.put("ViewTab.underlineColor", orange);


    // ============================
    // ONGLETS SWING CLASSIQUES
    // ============================

    UIManager.put("TabbedPane.background", panel);
    UIManager.put("TabbedPane.foreground", text);

    UIManager.put("TabbedPane.selectedBackground", panelLight);
    UIManager.put("TabbedPane.selectedForeground", text);

    UIManager.put("TabbedPane.hoverColor", blue);
    UIManager.put("TabbedPane.focusColor", blue);

    UIManager.put("TabbedPane.underlineColor", orange);

    UIManager.put("TabbedPane.tabType", "card");
    UIManager.put("TabbedPane.cardTabArc", 12);
    UIManager.put("TabbedPane.tabArc", 12);
    UIManager.put("TabbedPane.tabSelectionArc", 12);


    // ============================
    // BOUTONS
    // ============================

    UIManager.put("Button.background", panelLight);
    UIManager.put("Button.foreground", text);

    UIManager.put("Button.hoverBackground", blue);
    UIManager.put("Button.hoverForeground", text);

    UIManager.put("Button.pressedBackground", blue);
    UIManager.put("Button.pressedForeground", text);

    UIManager.put("Button.focusedBorderColor", orange);
    UIManager.put("Button.hoverBorderColor", orange);

    UIManager.put("Button.default.background", blue);
    UIManager.put("Button.default.foreground", text);


    // ============================
    // CHAMPS
    // ============================

    UIManager.put("TextField.background", panelLight);
    UIManager.put("TextField.foreground", text);
    UIManager.put("TextField.caretForeground", text);
    UIManager.put("TextField.selectionBackground", blue);
    UIManager.put("TextField.selectionForeground", text);

    UIManager.put("FormattedTextField.background", panelLight);
    UIManager.put("FormattedTextField.foreground", text);

    UIManager.put("PasswordField.background", panelLight);
    UIManager.put("PasswordField.foreground", text);

    UIManager.put("ComboBox.background", panelLight);
    UIManager.put("ComboBox.foreground", text);
    UIManager.put("ComboBox.selectionBackground", blue);
    UIManager.put("ComboBox.selectionForeground", text);

    UIManager.put("Spinner.background", panelLight);
    UIManager.put("Spinner.foreground", text);


    // ============================
    // CONSOLE / EDITEURS
    // ============================

    UIManager.put("TextArea.background", background);
    UIManager.put("TextArea.foreground", text);
    UIManager.put("TextArea.caretForeground", text);
    UIManager.put("TextArea.selectionBackground", blue);
    UIManager.put("TextArea.selectionForeground", text);

    UIManager.put("TextPane.background", background);
    UIManager.put("TextPane.foreground", text);
    UIManager.put("TextPane.caretForeground", text);

    UIManager.put("EditorPane.background", background);
    UIManager.put("EditorPane.foreground", text);
    UIManager.put("EditorPane.caretForeground", text);


    // ============================
    // LISTES / TABLEAUX / ARBRES
    // ============================

    UIManager.put("List.background", panel);
    UIManager.put("List.foreground", text);
    UIManager.put("List.selectionBackground", blue);
    UIManager.put("List.selectionForeground", text);

    UIManager.put("Tree.background", panel);
    UIManager.put("Tree.foreground", text);
    UIManager.put("Tree.selectionBackground", blue);
    UIManager.put("Tree.selectionForeground", text);

    UIManager.put("Table.background", panel);
    UIManager.put("Table.foreground", text);
    UIManager.put("Table.selectionBackground", blue);
    UIManager.put("Table.selectionForeground", text);

    UIManager.put("TableHeader.background", panelLight);
    UIManager.put("TableHeader.foreground", text);


    // ============================
    // TEXTE
    // ============================

    UIManager.put("Label.foreground", text);
    UIManager.put("Label.disabledForeground", mutedText);

    UIManager.put("TitledBorder.titleColor", text);


    // ============================
    // ACCENTS
    // ============================

    UIManager.put("Component.borderColor", border);
    UIManager.put("Component.focusColor", orange);
    UIManager.put("Component.focusedBorderColor", orange);

    UIManager.put("ProgressBar.foreground", orange);

    UIManager.put("Slider.trackValueColor", orange);
    UIManager.put("Slider.thumbColor", orange);


    // ============================
    // ARRONDIS
    // ============================

    UIManager.put("Button.arc", 12);
    UIManager.put("Component.arc", 10);
    UIManager.put("TextComponent.arc", 10);
    UIManager.put("ProgressBar.arc", 12);
    UIManager.put("CheckBox.arc", 6);
    UIManager.put("ScrollPane.arc", 10);

    UIManager.put("Popup.borderCornerRadius", 10);
    UIManager.put("PopupMenu.borderCornerRadius", 10);
    UIManager.put("ToolTip.borderCornerRadius", 10);

    UIManager.put("List.selectionArc", 8);
    UIManager.put("Tree.selectionArc", 8);
    UIManager.put("MenuItem.selectionArc", 8);
}
}
