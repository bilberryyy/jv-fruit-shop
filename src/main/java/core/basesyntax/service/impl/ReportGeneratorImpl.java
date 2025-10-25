package core.basesyntax.service.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.service.ReportGenerator;

import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport() {
        StringBuilder report = new StringBuilder();
        report.append("fruit,quantity\n"); // заголовок для підсумкового звіту

        for (Map.Entry<String, Integer> entry : Storage.fruits.entrySet()) {
            report.append(entry.getKey())   // назва фрукту
                    .append(",")
                    .append(entry.getValue()) // кількість фрукту
                    .append("\n");
        }
        return report.toString();
    }
}
