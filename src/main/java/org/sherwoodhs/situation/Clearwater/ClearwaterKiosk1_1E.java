package org.sherwoodhs.situation.Clearwater;

import org.sherwoodhs.AdvGame;
import org.sherwoodhs.location.Clearwater.ClearwaterKiosk;
import org.sherwoodhs.location.Location;
import org.sherwoodhs.npc.NPC;
import org.sherwoodhs.npc.TheDistributor;
import org.sherwoodhs.player.Player;
import org.sherwoodhs.situation.Haven.HavenCenter_E;
import org.sherwoodhs.situation.SitType;
import org.sherwoodhs.situation.Situation;

import javax.swing.*;

public class ClearwaterKiosk1_1E implements Situation {

    Player player = Player.getInstance();
    NPC distributor = TheDistributor.getInstance();
    Location location = ClearwaterKiosk.getInstance();

    private static Situation situation = new ClearwaterKiosk1_1E();

    @Override
    public String getTitle() {
        return "Kiosk Line";
    }

    @Override
    public String getDescription() {
        return "You keep waiting in line.\n\nEventually it's your turn, and the man looks at you expectantly.\n\n";
    }

    @Override
    public SitType getSitType() {return SitType.Exploration;}

    @Override
    public String[] getOptions() {
        String[] options = {"Approach the booth","Leave"}; // limit 6
        return options;
    }

    @Override
    public void perform(String option) {
        switch (option){
            case "Approach the booth":
                AdvGame.setSituation(ClearwaterKiosk1_2D.getInstance());
                break;
            case "Leave":
                AdvGame.setSituation(HavenCenter_E.getInstance());
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
