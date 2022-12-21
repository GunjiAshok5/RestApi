package com.ashok.converter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.ashok.binding.Student;

public class JavaToXmlConverter {

	
	public static void main(String[] args) throws Exception {
		Student s=new Student();
		s.setId(101);
		s.setName("Gunji Ashok");
		s.setRank(1);
		JAXBContext jaxbcontext=JAXBContext.newInstance(Student.class);
		Marshaller marshaller=jaxbcontext.createMarshaller();
		marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT,true);
		marshaller.marshal(s,System.out);
	}
}
