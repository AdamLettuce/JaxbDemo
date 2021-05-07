package pl.adamlettuce.marshaller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


public class JaxbMarshallerPrettyFormatted  implements JaxbMarshaller {

    JaxbMarshallerPrettyFormatted(){}

    @Override
    public void perform(File file, Object object) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            // output pretty printed
            jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(object, file);
            jaxbMarshaller.marshal(object, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
