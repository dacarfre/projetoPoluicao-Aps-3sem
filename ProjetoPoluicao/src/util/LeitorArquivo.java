package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorArquivo {
	
public String lerTexto(String filePath) throws IOException {	
	String dados;
	Path path= Paths.get(filePath);
	
	dados = new String(Files.readAllBytes(path));
	
	return dados;	
}

public String lerCSV(String filePath) {
	String json="";//Ler CSV e transformar em JSON

	return json;
}
}
