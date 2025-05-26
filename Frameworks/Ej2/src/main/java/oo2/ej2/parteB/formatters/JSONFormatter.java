package oo2.ej2.parteB.formatters;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class JSONFormatter extends SimpleFormatter {
    @Override
    public String format(LogRecord record) {
        return "{ \"message\": \"" + record.getMessage() + "\", \"level\": \"" + record.getLevel() + "\" }";
    }
}
