package models;

import enums.Leader;
import enums.TileType;

import java.util.ArrayList;
import java.util.List;

public class Countrie {
    private final String name;
    private Leader leader;
    private int stability;
    private Resources resources;
    private List<TileType> tiles;

    public Countrie(String name, Leader leader, int stability, Resources resources, List<TileType> tiles) {
        this.name = name;
        this.leader = leader;
        this.stability = stability;
        this.resources = resources;
        this.tiles = tiles;
    }

    public String getName() { return name; }
    public Leader getLeader() { return leader; }
    public int getStability() { return stability; }
    public Resources getResources() { return resources; }
    public List<TileType> getTiles() { return tiles; }
    public void setLeader(Leader leader) { this.leader = leader; }
    public void setStability(int stability) { this.stability = stability; }
    public void setTiles(List<TileType> tiles) { this.tiles = tiles; }
    public void setResources(Resources resources) { this.resources = resources; }

    public void changeStability(int delta) {
        this.stability = Math.max(0, Math.min(100, this.stability + delta));
        if (this.stability < 50) {
            return;
        }
    }
    public boolean consumeResources(Resources cost) {
        if (!resources.hasEnough(cost)) return false;
        resources.subtract(cost);
        return true;
    }
    public void addResources(Resources gain) {
        resources.add(gain);
    }
}
