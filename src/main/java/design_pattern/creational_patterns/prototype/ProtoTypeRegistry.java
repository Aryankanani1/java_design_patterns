package design_pattern.creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProtoTypeRegistry {
    private final Map<String, GeneralReport> reports = new HashMap<>();

    public ProtoTypeRegistry(){
        reports.put("SALES",new GeneralReport("Sales report","company logo","Sales footer"));
        reports.put("FINANCE",new GeneralReport("Finance report","company logo","Finance footer"));
    }

    public GeneralReport getReport(String type) {
        GeneralReport report = reports.get(type);
        if (report == null) {
            throw new IllegalArgumentException("Unknown report type: " + type);
        }
        return report.clone();
    }
}
