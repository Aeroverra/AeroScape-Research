# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

AeroScape is a RuneScape 508 private server (RSPS) research/development project. It contains a 3rd-party 508 client and server (originally "DavidScape"), plus a deobfuscator tool that is being developed to rename obfuscated client classes.

## Repository Structure

- `3rd Party/server508/` - Java game server (package: `DavidScape`), built with Maven
- `3rd Party/client508/` - Decompiled/deobfuscated 508 HD game client (JODE-decompiled), uses IntelliJ project files
- `AeroRunTekDeobfuscator/` - IntelliJ Java project for building a deobfuscator tool (currently scaffolding only)

## Build & Run Commands

### Server (3rd Party/server508/)
```
# Build - compiles all Java files under src/main/java into bin/
cd "3rd Party/server508"
build.bat

# Run - starts server on port 43594
cd "3rd Party/server508"
run.bat
# Equivalent to: java -cp bin DavidScape.Server
```
The server can also be built with Maven (`pom.xml` present, artifact `server508`).

### Client (3rd Party/client508/)
```
# Build - compiles against lib/hdlibs.jar
cd "3rd Party/client508"
build.bat
# Equivalent to: javac -deprecation -d "out/production/508 HD" -cp "lib/hdlibs.jar" -sourcepath src src/*.java

# Run - connects to server
cd "3rd Party/client508"
run.bat
# Equivalent to: java -cp "out/production/508 HD;lib/hdlibs.jar" client 1 live live software members english game0
```

### Deobfuscator (AeroRunTekDeobfuscator/)
IntelliJ IDEA project. Open `AeroRunTekDeobfuscator.iml` in IntelliJ. Entry point: `src/Main.java`.

## Server Architecture (DavidScape)

The server follows a single-threaded game loop pattern:

- **`Server`** - Entry point. Binds port 43594, loads map data and banned users, starts the `Engine`.
- **`Engine`** (`implements Runnable`) - Main game loop. Holds the player array (`Player[2000]`) and NPC array. Processes ticks for movement, combat, updates, etc.
- **`DavidScape.io`** - Network I/O layer: `SocketListener`, `Login`, `Packets`, `Frames` (outbound packets), `PacketManager`.
- **`DavidScape.io.packets`** - Individual inbound packet handlers (one class per packet type: `Walking`, `Commands`, `Equipment`, `PlayerCombat`, etc.).
- **`DavidScape.players`** - Player state, combat, items/bank/trade, movement/update masks.
- **`DavidScape.npcs`** - NPC definitions, loading from config files, combat, movement/update.
- **`DavidScape.Skills`** - Skill implementations (Fishing, Mining, Smithing, Woodcutting, Construction).
- **`DavidScape.world`** - World items (ground items, item definitions) and map data.
- **`DavidScape.util`** - Shared utilities (`Misc`, `Stream` for byte buffer IO, `Vars` for constants, `ShopHandler`).
- **`data/`** directory contains runtime config: character saves, NPC spawn lists, item definitions, map data, ban lists, objects config.

## Client Architecture (508 HD)

The client is a JODE-decompiled RuneScape 508 HD client. Classes are heavily obfuscated with names like `Class14_Sub8_Sub27`. The main entry point is `client.java` which extends `Applet_Sub1`. It depends on `lib/hdlibs.jar` for native/rendering libraries.

## Key Context

- This is a **research project** for understanding and modifying the RuneScape 508 protocol revision
- The client code is obfuscated - class/method/field names are auto-generated from decompilation and need renaming
- The `AeroRunTekDeobfuscator` project exists to automate renaming obfuscated client symbols
- Server uses text-based config files in `data/` (not a database)
- Player saves are file-based under `data/characters/`
- No test framework is configured; no linting tools
- License: MIT (Nicholas Halka)
