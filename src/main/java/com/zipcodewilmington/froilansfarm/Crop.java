package com.zipcodewilmington.froilansfarm;

import java.util.function.Supplier;

public abstract class Crop<YieldType extends Edible> extends Produce<YieldType> {
    boolean hasBeenHarvested = false;

    public Crop(Supplier<YieldType> supp) {
        super(supp);
    }

    public boolean getHarvestedFlag() {
        return hasBeenHarvested;
    }

    public void setHarvestedFlag(boolean newState) {
        this.hasBeenHarvested = newState;
    }
}
