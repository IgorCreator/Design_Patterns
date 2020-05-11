package com.prog.pattern.example.correct.impl.v1.print.foramatter;

import com.prog.pattern.example.correct.impl.v1.print.printer.Detail;

import java.util.List;

public class JsonFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append("\n");

        for (Detail detail : details) {
            builder.append("\t\"");
            builder.append(detail.getLabel());
            builder.append("\": ");
            builder.append("\"");
            builder.append(detail.getValue());
            builder.append("\",").append("\n");
        }

        builder.append("\t\"Classification\": ");
        builder.append("\"").append(header).append("\"");
        builder.append("\n");
        builder.append("}");

        return builder.toString();
    }
}
