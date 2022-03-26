package SeaBattle.Players.interfaces;

import SeaBattle.Ships.models.Vessel;
import java.util.List;

public interface Player {
    void getReadyForGame();
    List <Vessel> getVessel();
    Boolean isReadyToPlay();
}
