package book;

import java.util.List;

public interface BookDAO {
	boolean insertBook(BookVO book);
	BookVO selectBook(int BookNo);
	List<BookVO> selectAllBook();
	boolean updateBook(BookVO book);
	boolean deleteBook(int bookNo);
}
