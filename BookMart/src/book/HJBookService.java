package book;

import java.util.LinkedList;
import java.util.List;

public class HJBookService implements BookService{

	private BookDAO bookDAO;
	
	public HJBookService(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	@Override
	public boolean registBook(BookVO book) {
		return bookDAO.insertBook(book);
	}

	@Override
	public List<BookVO> listBooks() {
		return bookDAO.selectAllBook();
	}

	@Override
	public BookVO detailBookInfo(int bookNo) {
		return bookDAO.selectBook(bookNo);
	}

	@Override
	public boolean updateBookPrice(int bookNo, int price) {
		BookVO book = bookDAO.selectBook(bookNo);
		if(book != null) {
			book.setPrice(price);	
			bookDAO.updateBook(book);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateBookInstock(int bookNo, int instock) {
		BookVO book = bookDAO.selectBook(bookNo);
		if(book != null) {
			book.setInstock(instock);
			bookDAO.updateBook(book);
			return true;
		}
		return false;
	}

	@Override
	public boolean removieBook(int bookNo) {
		
//		BookVO book = bookDAO.selectBook(bookNo);
//		if(book != null) {
//			bookDAO.deleteBook(bookNo);
//			return true;
//		}
//		return false
		bookDAO.deleteBook(bookNo);
		return bookDAO.deleteBook(bookNo);
	}

}