package pl.adamlettuce.application;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import pl.adamlettuce.marshaller.JaxbMarshallerFactory;
import pl.adamlettuce.marshaller.JaxbUnmarshaller;
import pl.adamlettuce.xmlobjects.Operation;
import pl.adamlettuce.xmlobjects.Operations;


public class Main {
    
    private static final String DIRECTORY = System.getProperty("user.dir");
    private static final String FILE_PATH = DIRECTORY + "\\src\\main\\resources\\out.xml";

    public static void main(String[] args) {
        Operations operations = new Operations();
        operations.getOperation().addAll(getOperations());

        marshall(operations, new File(FILE_PATH));
        unmarshall(new File(FILE_PATH));
    }

    private static void marshall(Operations operations, File file) {
        new JaxbMarshallerFactory().newInstance().perform(file, operations);
    }

    private static void unmarshall(File file) {
        System.out.println((Operations) new JaxbUnmarshaller().perform(file, Operations.class));
    }

    private static List<Operation> getOperations() {
        List<Operation> operationsCollection = new ArrayList<Operation>();
        operationsCollection.add(new Operation("First", 1));
        operationsCollection.add(new Operation("Second", 2));
        operationsCollection.add(new Operation("Third", 3));
        operationsCollection.add(new Operation("Fourth", 4));
        operationsCollection.add(new Operation("Fifth", 5));
        operationsCollection.add(new Operation("Sixth", 6));
        return operationsCollection;
    }

}
