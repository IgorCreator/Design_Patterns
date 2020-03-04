package com.prog.pattern.example.correct.impl.v4.io;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream in = null;
		try {
			in = 
				new LowerCaseInputStream(
					new BufferedInputStream(
//						new FileInputStream("test.txt")));
						new FileInputStream("C:\\Users\\a638908\\TSS Project\\Patterns\\patterns-java\\decorator\\src\\main\\java\\com\\prog\\pattern\\example\\correct\\impl\\v4\\io\\test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) { in.close(); }
		}
		System.out.println();
		try (InputStream in2 = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("C:\\Users\\a638908\\TSS Project\\Patterns\\patterns-java\\decorator\\src\\main\\java\\com\\prog\\pattern\\example\\correct\\impl\\v4\\io\\test.txt")))
		)
		{
			while((c = in2.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
