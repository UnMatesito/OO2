package oo2.ej2.parteB.handlers;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.stream.Collectors;

public class WordFilterHandler extends Handler{
    private Handler handler;
    private List<String> badWords;

    public WordFilterHandler(Handler handler, List<String> badWords) {
        this.handler = handler;
        this.badWords = badWords;
    }

    @Override
    public void publish(LogRecord record) {
        String message = record.getMessage();
        String filteredMessage = Arrays.stream(message.split(" "))
                .map(word -> badWords.contains(word.toLowerCase()) ? "***" : word)
                .collect(Collectors.joining(" "));
        record.setMessage(message);
        handler.publish(record);
    }

    @Override
    public void flush() {
        handler.flush();
    }

    @Override
    public void close() throws SecurityException {
        handler.close();
    }
}
