package com.prog.pattern.example.correct.impl.v1.print.foramatter;

import com.prog.pattern.example.correct.impl.v1.print.printer.Detail;

import java.util.List;

public interface Formatter {
	String format(String header, List<Detail> details);
}
