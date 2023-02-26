package org.sherwoodhs.situation.Haven;

import org.sherwoodhs.AdvGame;
import org.sherwoodhs.situation.FoundationIntroduction.FoundationIntro_1D;
import org.sherwoodhs.situation.SitType;
import org.sherwoodhs.situation.Situation;

import javax.swing.*;

public class HavenCenter_E implements Situation {

    private static Situation situation = new HavenCenter_E();

    @Override
    public String getTitle() {
        return "Haven Center";
    }

    @Override
    public String getDescription() {
        return "You are in the city center of The Haven.";
    }

    @Override
    public SitType getSitType() {
        return SitType.Hub;
    }

    @Override
    public String[] getOptions() {
        String[] options = {"Walk over to Foundation booth"};
        return options;
    }

    @Override
    public void perform(String option) {
        switch (option){
            case "Walk over to Foundation booth":
                AdvGame.setSituation(FoundationIntro_1D.getInstance());
                break;
        }

    }

    @Override
    public ImageIcon prevImg() {
        return null;
    }

    public static Situation getInstance(){
        return situation;
    }
}
