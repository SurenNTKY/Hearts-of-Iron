package enums;

import java.util.List;

public enum TileType {
    Tile1(1, List.of(2, 5),      List.of()),
    Tile2(2, List.of(1, 6, 3),   List.of()),
    Tile3(3, List.of(2, 7, 4),  List.of()),
    Tile4(4, List.of(3, 8),  List.of()),
    Tile5(5, List.of(1, 6, 9),  List.of()),
    Tile6(6, List.of(2, 5, 10, 7),  List.of()),
    Tile7(7, List.of(3, 6, 11, 8),  List.of()),
    Tile8(8, List.of(4, 7, 12),  List.of(54,35,36)),
    Tile9(9, List.of(5, 13, 10),  List.of()),
    Tile10(10, List.of(6, 9, 14, 11),  List.of()),
    Tile11(11, List.of(7, 10, 15, 12),  List.of()),
    Tile12(12, List.of(8, 11, 16, 35),  List.of()),
    Tile13(13, List.of(9, 14),  List.of()),
    Tile14(14, List.of(10, 13, 15, 17, 18),  List.of()),
    Tile15(15, List.of(11, 14, 16, 19, 20),  List.of()),
    Tile16(16, List.of(12, 15, 21, 22, 39),  List.of()),
    Tile17(17, List.of(14, 18, 23),  List.of()),
    Tile18(18, List.of(14, 17, 19, 24),  List.of()),
    Tile19(19, List.of(15, 18, 25, 20),  List.of()),
    Tile20(20, List.of(15, 19, 26, 21),  List.of()),
    Tile21(21, List.of(16, 20, 27, 22),  List.of()),
    Tile22(22, List.of(16, 21, 28, 43),  List.of()),
    Tile23(23, List.of(17, 24, 29),  List.of()),
    Tile24(24, List.of(18, 23, 30, 25),  List.of()),
    Tile25(25, List.of(19, 24, 31, 26),  List.of()),
    Tile26(26, List.of(20, 25, 32, 27),  List.of()),
    Tile27(27, List.of(21, 26, 33, 28),  List.of()),
    Tile28(28, List.of(22, 27, 34, 47),  List.of()),
    Tile29(29, List.of(23, 30),  List.of()),
    Tile30(30, List.of(24, 29, 31),  List.of()),
    Tile31(31, List.of(25, 30, 32),  List.of()),
    Tile32(32, List.of(26, 31, 33),  List.of()),
    Tile33(33, List.of(27, 32, 34),  List.of()),
    Tile34(34, List.of(28, 33),  List.of(52,47,48,49)),
    Tile35(35, List.of(12, 39, 36),  List.of(8,36,54)),
    Tile36(36, List.of(35, 40, 37),  List.of(8,35,54)),
    Tile37(37, List.of(54, 36, 41, 38),  List.of()),
    Tile38(38, List.of(55, 37, 42),  List.of()),
    Tile39(39, List.of(16, 35, 40, 43),  List.of()),
    Tile40(40, List.of(36, 39, 41,44),  List.of()),
    Tile41(41, List.of(37, 40, 45, 42),  List.of()),
    Tile42(42, List.of(38, 41, 46),  List.of()),
    Tile43(43, List.of(39, 44, 47, 22),  List.of()),
    Tile44(44, List.of(40, 43, 48, 45),  List.of()),
    Tile45(45, List.of(41, 44, 49, 46),  List.of()),
    Tile46(46, List.of(42, 45, 50),  List.of()),
    Tile47(47, List.of(28, 43, 48),  List.of(34,48,49,52)),
    Tile48(48, List.of(44, 47, 49),  List.of(34,47,49,52)),
    Tile49(49, List.of(45, 48, 50),  List.of(34,47,48,52)),
    Tile50(50, List.of(46, 49, 51),  List.of()),
    Tile51(51, List.of(50, 53),  List.of()),
    Tile52(52, List.of(50, 53),  List.of(34)),
    Tile53(53, List.of(51, 52),  List.of()),
    Tile54(54, List.of(37, 55),  List.of(8,36,35,8)),
    Tile55(55, List.of(54, 56, 38),  List.of()),
    Tile56(56, List.of(55),  List.of());

    private final int index;
    private final List<Integer> landNeighbors;
    private final List<Integer> seaNeighbors;

    TileType(int index, List<Integer> landNeighbors, List<Integer> seaNeighbors) {
        this.index = index;
        this.landNeighbors = List.copyOf(landNeighbors);
        this.seaNeighbors = List.copyOf(seaNeighbors);
    }

    public int getIndex() {
        return index;
    }

    public List<Integer> getLandNeighbors() {
        return landNeighbors;
    }

    public List<Integer> getSeaNeighbors() {
        return seaNeighbors;
    }
}
