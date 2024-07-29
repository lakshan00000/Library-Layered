package library.ijse.service.custom;

import java.util.ArrayList;

import library.ijse.dto.BooksDto;
import library.ijse.service.SuperService;

public interface BooksService extends SuperService {
    String save (BooksDto booksDto) throws Exception;
    String update (BooksDto booksDto) throws Exception;
    String delete(BooksDto booksDto) throws Exception;
    BooksDto get (String book_id) throws Exception;
    ArrayList<BooksDto> getAll () throws Exception;


}
