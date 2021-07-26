package edu.miu.cs.cs525.exam;

public class Leaf extends Component {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    
    // Add this line

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
