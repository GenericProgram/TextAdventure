package org.sherwoodhs.situation.IkeaEntrance;

/*
The very first situation, introduces the character and motivation. Starts the get furniture quest.
 */

import org.sherwoodhs.AdvGame;
import org.sherwoodhs.quest.StolenFurnQuest;
import org.sherwoodhs.situation.Clearwater.ClearwaterKiosk1_0E;
import org.sherwoodhs.situation.Haven.HavenCenter_E;
import org.sherwoodhs.situation.LocationOptions.HiddenAlcove.HiddenAlcove1_0E;
import org.sherwoodhs.situation.SitType;
import org.sherwoodhs.situation.Situation;

import javax.swing.*;

public class EntranceSituation_0E implements Situation {
    private static Situation situation = new EntranceSituation_0E();

    @Override
    public String getTitle() {
        return "The Entrance";
    }

    @Override
    public String getDescription() {
        AdvGame.addQuest(StolenFurnQuest.getInstance());
        return "There it is—the Ikea furniture and home improvement store. \n" +
                "\n" +
                "The blue and yellow of the concrete building stretches from end to end across the huge lot. Despite the size of the retail store, there’s not a single person in sight. The parking lot is similarly deserted, with nothing but rows of empty spaces illuminated by the occasional streetlamp.";
    }

    @Override
    public SitType getSitType() {return SitType.Exploration;}

    @Override
    public String[] getOptions() {
        String[] options = {"Approach the building","Skip to Clearwater", "Skip to Hidden Alcove", "Skip to Haven"};
        return options;
    }

    @Override
    public void perform(String option) {
        switch (option){
            case "Approach the building":
                AdvGame.setSituation(EntranceSituation_1E.getInstance());
                break;
            case "Skip to Clearwater":
                AdvGame.setSituation(ClearwaterKiosk1_0E.getInstance());
                break;
            case "Skip to Hidden Alcove":
                AdvGame.setSituation(HiddenAlcove1_0E.getInstance());
                break;
            case "Skip to Haven":
                AdvGame.setSituation(HavenCenter_E.getInstance());
                break;
        }
    }

    @Override
    public ImageIcon prevImg() {
        return new ImageIcon("src/main/java/org/sherwoodhs/imgs/entrance/entrance.jpg");
    }

    public static Situation getInstance(){
        return situation;
    }

}
