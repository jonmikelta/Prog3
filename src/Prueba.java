import javax.swing.text.html.HTML;
import java.awt.Color;
//Imports relacionados con el proceso
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

//Imports de librería externa  -  https://sourceforge.net/projects/htmlparser/
import org.htmlparser.Node;
import org.htmlparser.Tag;
import org.htmlparser.http.ConnectionManager;
import org.htmlparser.lexer.Lexer;
import org.htmlparser.lexer.Page;
import org.htmlparser.nodes.TextNode;

//Import de consola para mostrar resultado
import utils.ventanas.ventanaConsola.VentanaColorConsola;



public class Prueba {

	urlAAnalizar = "http://www.marca.com/estadisticas/futbol/primera/2016_17/alaves/";
	urls = new ArrayList<>();
	// revisaWeb( urlAAnalizar );
	procesaWeb( urlAAnalizar, new ProcesadoWeb() {
		boolean enZonaJugadores = false;
		private String[] tagsBuscados1 = { "H4", "DIV" };
		private String[] tagsBuscados2 = { "LI", "UL", "DIV" };
		@Override
		public void procesaTexto(TextNode texto, LinkedList<Tag> pilaTags) {
			if (pilaContieneTags( pilaTags, tagsBuscados1 )) {
				if ("Jugadores".equals(texto.getText())) {
					enZonaJugadores = true;
				} else if (texto.getText().startsWith("Últimos partidos disputados")) {
					enZonaJugadores = false;
				}
			}
		}
		@Override
		public void procesaTag(Tag tag, LinkedList<Tag> pilaTags) {
			if (enZonaJugadores && pilaContieneTags( pilaTags, tagsBuscados2 )) {
				if (tag.getTagName().equals("A")) {
					System.out.println( tag.getAttribute( "href" ) );
					urls.add( tag.getAttribute("href") );
				}
			}
		}
		@Override
		public void procesaTagCierre( Tag tag, LinkedList<Tag> pilaTags, boolean enHtml ) {
		}
	});
	procesaJugadores();
}
}
}
