package com.zipcodewilmington.froilansfarm;

public class SharedFixture {
    private boolean initialized = false;
    Farmer froilan;

    Farm froilansFarm;

    Field froilansField;

    Pilot froilanda;

    CropRow<CornStalk> cornRow;
    CropRow<TomatoPlant> tomatoRow;

    ChickenCoop coopA;
    ChickenCoop coopB;
    ChickenCoop coopC;
    ChickenCoop coopD;

    Stable stableA;
    Stable stableB;
    Stable stableC;

    CropDuster duster;

    Tractor tractor;


    public void initialize() {
        froilan = new Farmer();

        froilansFarm = new Farm();

        froilansField = new Field();

        cornRow = new CropRow<>();
        tomatoRow = new CropRow<>();
        froilansField.add(cornRow);
        froilansField.add(tomatoRow);
        for (int i = 0; i < 3; i++) {
            froilansField.add(new CropRow<Crop>());
        }

        coopA = new ChickenCoop();
        coopB = new ChickenCoop();
        coopC = new ChickenCoop();
        coopD = new ChickenCoop();

        for (int i = 0; i < 3; i++) {
            coopA.add(new Chicken());
            coopB.add(new Chicken());
            coopC.add(new Chicken());
            coopD.add(new Chicken());
        }
        coopA.add(new Chicken());
        coopB.add(new Chicken());
        coopC.add(new Chicken());


        stableA = new Stable();
        stableB = new Stable();
        stableC = new Stable();
        for (int i = 0; i < 3; i++) {
            stableA.add(new Horse());
            stableB.add(new Horse());
            stableC.add(new Horse());
        }
        stableA.add(new Horse());

        duster = new CropDuster();
        tractor = new Tractor();

        froilanda = new Pilot();

        initialized = true;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public Farmer getFroilan() {
        return froilan;
    }

    public Farm getFroilansFarm() {
        return froilansFarm;
    }

    public Field getFroilansField() {
        return froilansField;
    }

    public Pilot getFroilanda() {
        return froilanda;
    }

    public CropRow<CornStalk> getCornRow() {
        return cornRow;
    }

    public CropRow<TomatoPlant> getTomatoRow() {
        return tomatoRow;
    }

    public ChickenCoop getCoopA() {
        return coopA;
    }

    public ChickenCoop getCoopB() {
        return coopB;
    }

    public ChickenCoop getCoopC() {
        return coopC;
    }

    public ChickenCoop getCoopD() {
        return coopD;
    }

    public Stable getStableA() {
        return stableA;
    }

    public Stable getStableB() {
        return stableB;
    }

    public Stable getStableC() {
        return stableC;
    }

    public CropDuster getDuster() {
        return duster;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public ChickenCoop[] getCoops() {
        return new ChickenCoop[] { coopA, coopB, coopC, coopD };
    }

    public Stable[] getStables() {
        return new Stable[] { stableA, stableB, stableC };
    }
}
