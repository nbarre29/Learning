package com.naveen;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Before;
import org.junit.Test;

public class DukeTest {

	private JAXBContext context;
	
	@Before
	public void init() throws JAXBException{
		this.context = JAXBContext.newInstance(Duke.class);
	}
	
	@Test
	public void serialization() throws JAXBException {
		Marshaller marshaller = this.context.createMarshaller();
		marshaller.marshal(new Duke("java", 2), new File("C:\\Users\\navee\\Desktop\\duke.xml"));
		
		Unmarshaller unmarshaller =this.context.createUnmarshaller();
		Object unmarshalled=unmarshaller.unmarshal(new File("C:\\Users\\navee\\Desktop\\duke.xml"));
		System.out.println("unmarshalled = " +  unmarshalled);
	} 

}
