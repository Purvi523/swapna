package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Notepad {//key value pairs==>key value. extension is .txt
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Users\\pdara\\eclipse-workspace\\Selenium\\src\\test\\resources\\notepad.txt");//notepad path
Properties p =new Properties();
p.load(fis);
  String d=p.getProperty("name");
  System.out.println(d);


}
}
