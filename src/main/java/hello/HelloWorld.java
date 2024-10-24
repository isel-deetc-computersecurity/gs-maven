package hello;

import org.joda.time.LocalTime;

import java.io.IOException;

public class HelloWorld {
	public static void main(String[] args) throws IOException {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());

		/* ===== */
		String btype = System.getenv("SCRIPTNAME");;//request.getParameter("backuptype");
		String cmd = new String("cmd.exe /K \"c:\\util\\rmanDB.bat "
				+btype+
				"&&c:\\utl\\cleanup.bat\"");

		Runtime.getRuntime().exec(cmd);
	}
}
