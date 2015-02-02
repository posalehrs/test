import java.io.IOException;
import translator.GoogleTranslator;
import java.net.MalformedURLException;
import org.json.simple.parser.ParseException;
import static translator.GoogleTranslator.*;

/**
 *
 * @author Code4LifeVn
 */
public class Demo {
    public static void main(String[] args) throws MalformedURLException, IOException, ParseException {
        GoogleTranslator translator = new GoogleTranslator();
        translator.setSrcLang(LANGUAGE.ENGLISH);
        translator.setDestLang(LANGUAGE.VIETNAMESE);
        String data = translator.translate("bye school");
        System.out.println(data);
    }
    
    
}