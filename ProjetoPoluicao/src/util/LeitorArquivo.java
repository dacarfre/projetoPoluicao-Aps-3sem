package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeitorArquivo {
	
public String lerTexto(String path) throws IOException {	
	String dados="";
  	try(BufferedReader br = new BufferedReader(new FileReader(path))) {
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();

	    while (line != null) {
	        sb.append(line);
	        sb.append(System.lineSeparator());
	        line = br.readLine();
	    }
	    dados = sb.toString();
	}	
	return dados;	
}

public String lerCSV(String path) {
	String json="";//Ler CSV e transformar em JSON

	return json;
}
}
