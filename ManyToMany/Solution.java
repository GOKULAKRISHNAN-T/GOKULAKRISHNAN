package org.sol;

import java.io.IOException;

import org.book.Book;
import org.ebook.Ebook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.pbook.PaperBook;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Book book =  new Book();
		Ebook ebook = new Ebook();
		PaperBook pbook = new PaperBook();
		
	}

}
