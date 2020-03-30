package util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeitorArquivo {
	
public String lerTexto(String path) throws IOException {	
	path = new File(path).getAbsolutePath();
	
	byte[] bytes = Files.readAllBytes(Paths.get(path));
	
    String dados = new String(bytes, StandardCharsets.UTF_8);
       
	return dados;
}

public String lerCSV(String path) {
	String json="";//Ler CSV e transformar em JSON

	return json;
}
}
