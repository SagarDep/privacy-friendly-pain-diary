package org.secuso.privacyfriendlypaindiary.database.entities.interfaces;

import org.secuso.privacyfriendlypaindiary.database.entities.enums.BodyRegion;
import org.secuso.privacyfriendlypaindiary.database.entities.enums.PainQuality;
import org.secuso.privacyfriendlypaindiary.database.entities.enums.Time;

import java.util.EnumSet;

/**
 * @author Susanne Felsen
 * @version 20171205
 */
public interface PainDescriptionInterface extends PersistentObject {

    public int getPainLevel();
    public void setPainLevel(int painLevel);
    public BodyRegion getBodyRegion();
    public void setBodyRegion(BodyRegion bodyRegion);
    public EnumSet<PainQuality> getPainQualities();
    public void setPainQualities(EnumSet<PainQuality> painQualities);
    public EnumSet<Time> getTimesOfPain();
    public void setTimesOfPain(EnumSet<Time> timesOfPain);

}