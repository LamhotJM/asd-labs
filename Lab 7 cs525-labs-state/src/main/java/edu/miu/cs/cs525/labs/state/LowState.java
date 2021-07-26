package edu.miu.cs.cs525.labs.state;

public class LowState implements CeilingState{
    CeilingFan ceilingFan;
    public LowState(CeilingFan newCeilingFan){
        ceilingFan = newCeilingFan;
    }
    @Override
    public void pullgreen() {
        ceilingFan.setCeilingState(ceilingFan.getMediumState());
        System.out.println( "medium speed" );
    }

    @Override
    public void pullred() {
        ceilingFan.setCeilingState(ceilingFan.getOFfState());
        System.out.println( "turning off" );
    }
}
