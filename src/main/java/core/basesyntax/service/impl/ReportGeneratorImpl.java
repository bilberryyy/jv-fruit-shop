package core.basesyntax.service.impl;

import core.basesyntax.service.ReportGenerator;
import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport(Map<String, Integer> fruitData) {
        StringBuilder report = new StringBuilder();
        report.append("fruit,quantity\n");

        //noinspection SingleSpaceSeparator
        for (Map.Entry<String, Integer> entry : fruitData.entrySet()) {
            report.append(entry.getKey())
                    .append(",")
                    .append(entry.getValue())
                    .append("\n");
        }
        return report.toString();
    }
}
