package contentt;

import java.util.LinkedList;
import java.util.Scanner;

public class Conteudo {
LinkedList<String> content  = new LinkedList<String>();
Scanner scan = new Scanner(System.in);
String a;
public boolean createContent(String a) {
	
	
	content.add(a);
	return true;
}
public boolean listContent() {
	System.out.println("Os conteúdos são : ");
	System.out.println(content);
	return true;
}
public boolean updateContent(String conteudoAntigo, String novoConteudoAlteracao) {
	
	content.remove(conteudoAntigo);
	content.add(novoConteudoAlteracao);
	listContent();
	return true;
}
public boolean deleteContent(String a) {
	
	content.remove(a);
	listContent();
	return true;
}
}
