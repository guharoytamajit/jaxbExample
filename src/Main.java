import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import messages.dto.com.Note;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Note note = new Note();

        JAXBContext context = JAXBContext.newInstance(Note.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(note, System.out);
    }
}
