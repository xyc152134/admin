package dr.xyc.week02.day03;

public enum Season {
    SPTING("春天", "spring"),
    SUMMER("夏天", "spring"),
    ANTUM("秋天", "spring"),
    WINDER("冬天", "spring"),
    ;

    private String name;
    private String description;

    Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
