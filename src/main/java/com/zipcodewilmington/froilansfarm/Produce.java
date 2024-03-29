package com.zipcodewilmington.froilansfarm;

import java.util.Objects;
import java.util.function.Supplier;

public abstract class Produce<YieldType/* extends Edible*/> {
    private final Supplier<? extends YieldType> supplier;
    boolean hasBeenFertilized;
    YieldType produceYield;

    public Produce(Supplier<? extends YieldType> supp) {
        this.hasBeenFertilized = false;
        supplier = Objects.requireNonNull(supp);
        this.produceYield = supplier.get();
    }

    public YieldType yield() {
        if (hasBeenFertilized) {
            return this.produceYield;
        }
        return null;
    }

    public boolean getFertilizedFlag() {
        return hasBeenFertilized;
    }

    public void setFertilizedFlag(boolean newState) {
        this.hasBeenFertilized = newState;
    }
}
