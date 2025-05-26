package oo2.ej2.parteB.handlers;

import oo2.ej2.parteB.mail.MailExample;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MailHandler extends Handler {
    @Override
    public void publish(LogRecord record) {
        MailExample.sendMail(record.getLevel().toString(), record.getMessage());
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
