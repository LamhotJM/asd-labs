package edu.miu.cs.cs525.exam;

import java.awt.*;

public interface Visitor {
    void visit(Composite composite);
    void visit(Leaf leaf);
}
