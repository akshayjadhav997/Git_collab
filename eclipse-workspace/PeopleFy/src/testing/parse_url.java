package testing;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.spi.FileSystemProvider;

public class parse_url {
public static void main(String[] args) throws IOException {
	String url1= "https://www.baeldung.com/java-comparing-arrays";
	URL url = new URL(url1);
	String protocol= url.getProtocol();
	String host= url.getHost();
	String Athority= url.getAuthority();
	String path= url.getPath();
	String userinfo= url.getUserInfo();
	int port= url.getPort();
	URLConnection portbroken= url.openConnection();
	
	
	
	System.out.println(protocol);
	System.out.println(host);
	System.out.println(Athority);
	System.out.println(path);
	System.out.println(userinfo);
	System.out.println(port);
	System.out.println(portbroken);
	
	
	}
	
}
