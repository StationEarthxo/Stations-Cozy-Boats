package com.cozyboats;

public enum PlacementHeight
{
    GROUND("Ground", 0),
    QUARTER_TILE("1/4 tile", 32),
    HALF_TILE("1/2 tile", 64),
    THREE_QUARTER_TILE("3/4 tile", 96),
    ONE_TILE("1 tile", 128);

    private final String label;
    private final int height;

    PlacementHeight(String label, int height)
    {
        this.label = label;
        this.height = height;
    }

    int getHeight()
    {
        return height;
    }

    @Override
    public String toString()
    {
        return label;
    }
}
