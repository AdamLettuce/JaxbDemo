package pl.adamsalata.marshaller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


public class JaxbMarshallerBasic implements JaxbMarshaller {

    JaxbMarshallerBasic() {}

    @Override
    public void perform(File file, Object object) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.marshal(object, file);
            jaxbMarshaller.marshal(object, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
