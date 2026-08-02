package com.cozyboats;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(WorldBuilderConfig.GROUP)
public interface WorldBuilderConfig extends Config
{
    String GROUP = "cozyboats";

    @ConfigItem(
        keyName = "requireShift",
        name = "Require Shift",
        description = "Only show Station's Cozy Boats options while Shift is held"
    )
    default boolean requireShift()
    {
        return true;
    }

    @ConfigItem(
        keyName = "placementMode",
        name = "Placement mode",
        description = "Choose tile-centred placement or a mouse-following sub-tile grid"
    )
    default PlacementMode placementMode()
    {
        return PlacementMode.FINE_GRID;
    }

    @ConfigItem(
        keyName = "placementScale",
        name = "New prop size",
        description = "Default size used when selecting a new boat decoration"
    )
    default PlacementScale placementScale()
    {
        return PlacementScale.NORMAL;
    }

    @ConfigItem(
        keyName = "placementHeight",
        name = "New prop height",
        description = "Default height used when selecting a new boat decoration"
    )
    default PlacementHeight placementHeight()
    {
        return PlacementHeight.GROUND;
    }

    @ConfigItem(
        keyName = "placementRotation",
        name = "New prop rotation",
        description = "Default rotation used when selecting a new boat decoration"
    )
    default PlacementRotation placementRotation()
    {
        return PlacementRotation.DEGREES_0;
    }

    @Range(min = 25, max = 2000)
    @ConfigItem(
        keyName = "maximumProps",
        name = "Maximum props",
        description = "Safety limit for active and imported boat decorations"
    )
    default int maximumProps()
    {
        return 500;
    }

}
