package models;

import enums.Countries;
import enums.FactoryType;
import enums.TileType;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    private final int index;
    private Countries owner;
    private final List<Integer> landNeighbors;
    private final List<Integer> seaNeighbors;
    private final List<FactoryType> factories;
    private Terrain terrain;
    private Weather weather;
    private final List<Battalion> battalions;

    public Tile(TileType type, Countries initialOwner) {
        this.index = type.getIndex();
        this.landNeighbors = new ArrayList<>(type.getLandNeighbors());
        this.seaNeighbors = new ArrayList<>(type.getSeaNeighbors());
        this.owner = initialOwner;
        this.factories = new ArrayList<>();
        this.terrain = null;
        this.weather = null;
        this.battalions    = new ArrayList<>();
    }

    public int getIndex() {
        return index;
    }

    public Countries getOwner() {
        return owner;
    }

    public List<Integer> getLandNeighbors() {
        return landNeighbors;
    }

    public List<Integer> getSeaNeighbors() {
        return seaNeighbors;
    }

    public List<FactoryType> getFactories() {
        return factories;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public Weather getWeather() {
        return weather;
    }

    public List<Battalion> getBattalions() {
        return battalions;
    }

    public void setOwner(Countries owner) {
        this.owner = owner;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
