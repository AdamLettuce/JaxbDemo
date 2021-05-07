package pl.adamlettuce.marshaller;


public class JaxbMarshallerFactory {
    public JaxbMarshaller newInstance() {
        return new JaxbMarshallerPrettyFormatted();
    }
}
