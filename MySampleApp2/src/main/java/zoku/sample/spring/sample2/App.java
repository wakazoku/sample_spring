package zoku.sample.spring.sample2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.Resource;

public class App {
	private static ApplicationContext app;

	public static void main(String[] args) {
		app = new StaticApplicationContext();
		Resource res = app.getResource("classpath:sample.txt");

		if (res.exists()) {
			try {
				System.out.println("URI:" + res.getURI());

			} catch (IOException e) {
				e.printStackTrace();

			}

			System.out.println("*" + res.getFilename() + "* ==============");

			InputStream input = null;

			try {
				input = res.getInputStream();
				BufferedInputStream buf_input = new BufferedInputStream(input);

				byte[] bytes = new byte[10240];
				buf_input.read(bytes);

				String xml_str = new String(bytes).trim();
				System.out.println(xml_str);

			} catch (IOException e) {
				e.printStackTrace();

			}

			System.out.println("* end * ==============");

		} else {
			System.out.println("not found:" + res);

		}

	}

}
