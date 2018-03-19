package net.taken.redsnake.tree.expressions.literals;

import net.taken.redsnake.lang.RedsEnvironment;
import net.taken.redsnake.lang.RedsInteger;

public class IntegerLiteral extends Literal {

    private final int value;

    public IntegerLiteral(String value) {
        this.value = Integer.valueOf(value);
    }

    @Override
    public RedsInteger execute(RedsEnvironment env) {
        return new RedsInteger(value);
    }
}
