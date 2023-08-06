package com.structural_patterns.adapter.adapters;

import com.structural_patterns.adapter.round.RoundPeg;
import com.structural_patterns.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg peg) {
        this.squarePeg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        return result;
    }
}
