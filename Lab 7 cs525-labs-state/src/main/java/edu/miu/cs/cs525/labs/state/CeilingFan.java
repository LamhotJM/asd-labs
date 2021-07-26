package edu.miu.cs.cs525.labs.state;

public class CeilingFan {
    private CeilingState ceilingState;
    private final CeilingState highState;
    private final CeilingState mediumState;
    private final CeilingState lowState;
    private final CeilingState offState;

    public CeilingFan() {
        highState = new HighState(this);
        mediumState = new MediumState(this);
        lowState = new LowState(this);
        offState = new OffState(this);
        ceilingState = offState;
    }

    void setCeilingState(CeilingState newCeilingState) {
        ceilingState = newCeilingState;
    }

    public CeilingState getOFfState() {
        return offState;
    }

    public CeilingState getLowState() {
        return lowState;
    }

    public CeilingState getMediumState() {
        return mediumState;
    }

    public CeilingState getHighState() {
        return highState;
    }

    public void pullgreen() {
        ceilingState.pullgreen();

    }

    public void pullred() {
        ceilingState.pullred();
    }
}
