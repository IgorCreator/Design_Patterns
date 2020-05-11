package com.prog.pattern.example.correct.impl.v1.print.foramatter;

import com.prog.pattern.example.correct.impl.v1.print.printer.Detail;

import java.util.List;

public class HtmlFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
		builder.append("<th>");
		builder.append("Classification");
		builder.append("</th>");
		builder.append("<th>");
		builder.append(header);
		builder.append("</th>");
		builder.append("\n");

		for (Detail detail : details) {
			builder.append("<tr><td>");
			builder.append(detail.getLabel());
			builder.append("</td><td>");
			builder.append(detail.getValue());
			builder.append("</td></tr>");
			builder.append("\n");
		}
		builder.append("</table>");

		return builder.toString();
	}

}
