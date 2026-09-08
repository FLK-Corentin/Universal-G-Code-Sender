package com.willwinder.ugp.welcome;

import java.awt.Color;
import javax.swing.UIManager;
import org.openide.modules.OnStart;

@OnStart
public final class FlkThemeInstaller implements Runnable {

    @Override
    public void run() {

        /*
         * -----------------------------
         * ARRONDIS
         * -----------------------------
         */

        UIManager.put("Button.arc", 12);
        UIManager.put("Component.arc", 12);
        UIManager.put("ProgressBar.arc", 12);
        UIManager.put("CheckBox.arc", 6);

        UIManager.put("ScrollPane.arc", 10);

        UIManager.put("Popup.borderCornerRadius", 10);
        UIManager.put("PopupMenu.borderCornerRadius", 10);
        UIManager.put("ToolTip.borderCornerRadius", 10);

        UIManager.put("List.selectionArc", 8);
        UIManager.put("Tree.selectionArc", 8);
        UIManager.put("MenuItem.selectionArc", 8);

        /*
         * Onglets sous forme de cartes
         */
        UIManager.put("TabbedPane.tabType", "card");
        UIManager.put("TabbedPane.cardTabArc", 12);
        UIManager.put("TabbedPane.tabArc", 12);
        UIManager.put("TabbedPane.tabSelectionArc", 12);


        /*
         * -----------------------------
         * PALETTE FABLAB EN KIT
         * -----------------------------
         */

        Color background = Color.decode("#181b24");
        Color panel = Color.decode("#222634");
        Color blue = Color.decode("#262e60");
        Color orange = Color.decode("#ffa243");
        Color text = Color.decode("#f2f2f2");
        Color mutedText = Color.decode("#b8bcc8");
        Color border = Color.decode("#343948");


        /*
         * Fonds
         */
        UIManager.put("RootPane.background", background);
        UIManager.put("Desktop.background", background);
        UIManager.put("Nb.EmptyEditorArea.background", background);

        UIManager.put("Panel.background", panel);

        UIManager.put("MenuBar.background", background);
        UIManager.put("ToolBar.background", background);

        UIManager.put("TabbedPane.background", background);
        UIManager.put("TabbedPane.selectedBackground", panel);


        /*
         * Bordures
         */
        UIManager.put("Component.borderColor", border);
        UIManager.put("Separator.foreground", border);


        /*
         * Accent orange FLK
         */
        UIManager.put("Component.focusColor", orange);
        UIManager.put("Component.focusedBorderColor", orange);

        UIManager.put("Button.focusedBorderColor", orange);
        UIManager.put("Button.hoverBorderColor", orange);

        UIManager.put("TabbedPane.underlineColor", orange);
        UIManager.put("EditorTab.underlineColor", orange);
        UIManager.put("ViewTab.underlineColor", orange);

        UIManager.put("ProgressBar.foreground", orange);

        UIManager.put("Slider.trackValueColor", orange);
        UIManager.put("Slider.thumbColor", orange);


        /*
         * Sélections en bleu FLK
         */
        UIManager.put("List.selectionBackground", blue);
        UIManager.put("Tree.selectionBackground", blue);
        UIManager.put("Table.selectionBackground", blue);
        UIManager.put("ComboBox.selectionBackground", blue);
        UIManager.put("TextField.selectionBackground", blue);
        UIManager.put("MenuItem.selectionBackground", blue);


        /*
         * Bouton principal
         */
        UIManager.put("Button.default.background", blue);
        UIManager.put("Button.default.foreground", text);


        /*
         * Texte
         */
        UIManager.put("Label.foreground", text);
        UIManager.put("Label.disabledForeground", mutedText);
    }
}
