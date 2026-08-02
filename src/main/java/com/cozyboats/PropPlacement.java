package com.cozyboats;

import java.util.Objects;
import java.util.UUID;

final class PropPlacement
{
    String id = UUID.randomUUID().toString();
    String name;
    int objectId = -1;
    int objectType = 10;
    int objectOrientation;
    int modelId = -1;
    int npcId = -1;
    int animationId = -1;
    boolean animationLoop = true;
    int boatLocalX = -1;
    int boatLocalY = -1;
    int boatPlane;
    int offsetX;
    int offsetY;
    int rotation;
    int height;
    int scale = 128;

    PropPlacement()
    {
    }

    PropPlacement copy()
    {
        PropPlacement p = new PropPlacement();
        p.id = id;
        p.name = name;
        p.objectId = objectId;
        p.objectType = objectType;
        p.objectOrientation = objectOrientation;
        p.modelId = modelId;
        p.npcId = npcId;
        p.animationId = animationId;
        p.animationLoop = animationLoop;
        p.boatLocalX = boatLocalX;
        p.boatLocalY = boatLocalY;
        p.boatPlane = boatPlane;
        p.offsetX = offsetX;
        p.offsetY = offsetY;
        p.rotation = rotation;
        p.height = height;
        p.scale = scale;
        return p;
    }

    PropPlacement duplicateAt(int x, int y, int z)
    {
        PropPlacement p = copy();
        p.id = UUID.randomUUID().toString();
        p.boatLocalX = x;
        p.boatLocalY = y;
        p.boatPlane = z;
        return p;
    }

    boolean isValid()
    {
        return id != null && name != null
            && ((objectId >= 0 && npcId == -1) || (npcId >= 0 && objectId == -1))
            && modelId == -1 && animationId >= -1
            && boatLocalX >= 0 && boatLocalY >= 0 && boatPlane >= 0 && boatPlane <= 3
            && offsetX >= -64 && offsetX <= 64
            && offsetY >= -64 && offsetY <= 64
            && scale >= 16 && scale <= 1024;
    }

    @Override
    public boolean equals(Object other)
    {
        return other instanceof PropPlacement && Objects.equals(id, ((PropPlacement) other).id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(id);
    }
}
