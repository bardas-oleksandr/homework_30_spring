package ua.levelup.WithAnnotations.Quests;

import ua.levelup.WithAnnotations.Heroes.GoodGuy;
import ua.levelup.WithXML.Heroes.DeadKnightException;

public interface Quest {
    void embark(GoodGuy contestant) throws DeadKnightException;
}
