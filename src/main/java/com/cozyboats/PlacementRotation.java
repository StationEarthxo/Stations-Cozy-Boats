package com.cozyboats;

public enum PlacementRotation
{
    DEGREES_0("0 degrees", 0),
    DEGREES_45("45 degrees", 256),
    DEGREES_90("90 degrees", 512),
    DEGREES_135("135 degrees", 768),
    DEGREES_180("180 degrees", 1024),
    DEGREES_225("225 degrees", 1280),
    DEGREES_270("270 degrees", 1536),
    DEGREES_315("315 degrees", 1792);

    private final String label;
    private final int rotation;

    PlacementRotation(String label, int rotation)
    {
        this.label = label;
        this.rotation = rotation;
    }

    int getRotation()
    {
        return rotation;
    }

    @Override
    public String toString()
    {
        return label;
    }
}
