package edu.miu.cs.cs525.exam2;

public class Leaf extends Component {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
