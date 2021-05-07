package pl.adamsalata.marshaller;


public class JaxbMarshallerFactory {
    public JaxbMarshaller newInstance() {
        return new JaxbMarshallerPrettyFormatted();
    }
}
