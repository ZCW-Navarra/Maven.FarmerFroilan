package com.zipcodewilmington.froilansfarm;

import java.util.Objects;

public class Tractor<T1 extends Rider> implements FarmVehicle {
    public T1 rider;
    public <T2 extends Crop> boolean harvest(CropRow<T2> cr) {
        boolean result = true;
//        if (cr.getCrops().length == 0) {
//            return false;
//        }
        for (Crop c : cr.getCrops()) {
            result = result && Objects.nonNull(c.yield());
            c.setHarvestedFlag(true);
        }
        return result;

//        return false;
    }

    @Override
    public String makeNoise() {
        return "Vroom";
    }

    @Override
    public <T extends Rider> boolean setRider(T newRider) {
        if (Objects.isNull(this.rider) && Objects.nonNull(newRider)) {
            this.rider = (T1) newRider;
            return true;
        } else if (Objects.nonNull(this.rider) && Objects.isNull(newRider)) {
            this.rider = null;
            return true;
        }
        return false;
    }

    @Override
    public <T extends Rider> T getRider() {
        return (T) this.rider;
//        return null;
    }
}
