public class VideoGames {
    private String name;
    private int sales;
    private String category;
    private int restrictionAge;

    public VideoGames(String name, int sales, String category, int restrictionAge) {
        this.name = name;
        this.sales = sales;
        this.category = category;
        this.restrictionAge = restrictionAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRestrictionAge() {
        return restrictionAge;
    }

    public void setRestrictionAge(int restrictionAge) {
        this.restrictionAge = restrictionAge;
    }
}
