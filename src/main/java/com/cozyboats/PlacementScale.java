package com.cozyboats;

public enum PlacementScale
{
    HALF("0.5x", 64),
    NORMAL("1x", 128),
    ONE_AND_HALF("1.5x", 192),
    DOUBLE("2x", 256),
    TRIPLE("3x", 384);

    private final String label;
    private final int scale;

    PlacementScale(String label, int scale)
    {
        this.label = label;
        this.scale = scale;
    }

    int getScale()
    {
        return scale;
    }

    @Override
    public String toString()
    {
        return label;
    }
}
