package ua.levelup.WithXML.Quests;

import ua.levelup.WithXML.Heroes.DeadKnightException;
import ua.levelup.WithXML.Heroes.GoodGuy;

public interface Quest {
    void embark(GoodGuy contestant) throws DeadKnightException;
}
