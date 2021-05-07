package pl.adamlettuce.marshaller;

import java.io.File;


public interface JaxbMarshaller {
    void perform(File file, Object object);
}
