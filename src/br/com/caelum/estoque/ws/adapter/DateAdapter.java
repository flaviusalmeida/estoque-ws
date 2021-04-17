package br.com.caelum.estoque.ws.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/* Reponsavel por 'converter' o padrão UTC para o pattern MM/dd/yyyy para facilitar para o usuario*/
public class DateAdapter extends XmlAdapter<String, Date> {

	private String pattern = "MM/dd/yyyy";

	public String marshal(Date date) throws Exception {
		return new SimpleDateFormat(pattern).format(date);
	}

	public Date unmarshal(String dateString) throws Exception {
		System.out.println(dateString);
		return new SimpleDateFormat(pattern).parse(dateString);
	}

}
