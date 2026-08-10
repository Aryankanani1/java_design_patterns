package design_pattern.creational_patterns.prototype;

public class GeneralReport implements Report{

    private final String title;
    private final String logo;
    private final String footer;

    public GeneralReport(String title, String logo, String footer) {
        this.title = title;
        this.logo = logo;
        this.footer = footer;
    }

    @Override
    public GeneralReport clone() {
        GeneralReport generalReport = new GeneralReport(title,logo,footer);
        return generalReport;
    }

    public void print() {
        System.out.println(title + " | " + logo + " | " + footer);
    }
}
