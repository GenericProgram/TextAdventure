package org.sherwoodhs.ui;

import org.sherwoodhs.quest.Quest;
import org.sherwoodhs.ui.util.CellRenderer;
import org.sherwoodhs.ui.util.DisabledItemSelectionModel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class QuestPanel extends JPanel {
    public static final QuestPanel questPanel = new QuestPanel();
    private DefaultListModel<String> questListModel = new DefaultListModel<>();
    private JList<String> questList;

    private QuestPanel() {
        super(new BorderLayout());
        setPreferredSize(new Dimension(150,550));
        setBorder(new TitledBorder("Current Quests"));

        questList = new JList<>(questListModel);
        questList.setSelectionModel(new DisabledItemSelectionModel());
        questList.setCellRenderer(new CellRenderer());
        add(questList);
    }
    /**
     * Adds one element to questList without clearing its contents after adding "> " to the beginning of the string
     * @param quest one element to be added to questList
     */
    public void addQuest(Quest quest) { questListModel.addElement(setQuestConvention(quest.getName())); }
    private String setQuestConvention(String s) {return "> " + s;}
    /**
     * Removes one element from questList without clearing its contents
     * @param quest one element to be removed from questList; method will not work if the element cannot be found
     */
    public void removeQuest(Quest quest) {
        String s = setQuestConvention(quest.getName());
        System.out.println(s);
        questListModel.removeElement(s);
    }

}