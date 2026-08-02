# Station's Cozy Boats

Station's Cozy Boats is a RuneLite plugin for decorating your own Sailing boat with
client-side RuneScape scenery. Decorations are anchored to the boat's deck, so they
travel and turn with the vessel instead of remaining behind on the world map.

This is a separate companion to Station's Cozy Clutter. It uses its own plugin
package, settings group, saved placements, and Boatpack format; enabling or editing
one plugin does not alter the other.

## Features

- Search a visual catalogue of static objects, animated objects, and animated NPCs.
- Select a decoration in the sidebar and preview it directly on your boat.
- Left-click to place, right-click or press Escape to cancel, and use the scroll wheel
  to rotate the cursor preview.
- Choose tile-centred, fine-grid, or precise-grid placement.
- Preselect the size, height, and starting rotation for newly chosen decorations.
- Move, duplicate, delete, rotate, resize, raise, lower, and nudge placed decorations.
- Undo changes and safely delete an entire build with confirmation.
- Export and import portable `CB1:` Boatpack codes.
- Keep up to 500 decorations by default, with a configurable safety limit.

Everything drawn by this plugin is client-side. It does not change the game world,
your real boat, or what players without the same Boatpack can see.

## Running locally

The project requires Java 11 or newer.

```text
gradlew.bat test
gradlew.bat run
```

The `run` task opens RuneLite in developer mode with Station's Cozy Boats loaded.
Board your own boat, open the sailboat sidebar button, choose a decoration, and hover
the deck to place it.

## Building a boat

1. Board your own Sailing boat.
2. Enable **Station's Cozy Boats**.
3. Open its sidebar catalogue.
4. Choose your preferred size, height, and starting rotation presets.
5. Select a decoration and hover your deck.
6. Scroll to fine-tune its rotation, then left-click to place it.
7. Hold Shift and right-click the deck to edit placed decorations or share a Boatpack.

You can also hold Shift and right-click existing game scenery to copy its object into
the placement cursor.

## Boatpacks

Use **Export Boatpack** from the boat-deck menu to copy a `CB1:` code. Send that code
to a friend who has Station's Cozy Boats, then they can copy it and choose
**Import Boatpack**. The layout is recreated using boat-local deck coordinates and
retains animation, rotation, size, height, and precise nudge offsets.

## Safety

The plugin only stores object/NPC definitions and boat-local placement data. Models
that cannot be constructed safely are skipped or quarantined, and the render safety
probe inherited from Station's Cozy Clutter remains enabled.

## License

BSD 2-Clause. See [LICENSE](LICENSE).
