package demo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Binder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class BinderDemo {
	public static void main(String[] args) {

		// create a Student object and set its properties
		Student student = new Student();
		student.setId(10);
		student.setName("Malik");
		student.setAge(11);

		try {
			// we need a blank document to store final xml output
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbf.newDocumentBuilder();
			Document document = docBuilder.newDocument();

			// create JAXBContext which will be used to create a Binder
			JAXBContext jc = JAXBContext.newInstance(Student.class);

			// create binder object
			Binder<Node> binder = jc.createBinder();

			// set the property
			binder.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// let's marshal the object and store in document
			binder.marshal(student, document);

			// finally print the marshalled object on stdout
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			t.transform(new DOMSource(document), new StreamResult(System.out));

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
