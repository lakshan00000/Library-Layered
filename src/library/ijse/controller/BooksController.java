/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.ijse.controller;

import java.util.ArrayList;

import library.ijse.dto.BooksDto;
import library.ijse.service.ServiceFactory;
import library.ijse.service.custom.BooksService;

/**
 *
 * @author laksh
 */
public class BooksController {

    private BooksService booksService = (BooksService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.Books);


    public String save(BooksDto booksDto) throws Exception{
       return booksService.save(booksDto);
    }
    public String update(BooksDto booksDto) throws Exception{
        return booksService.update(booksDto); 
    }
    public String delete (BooksDto booksDto) throws Exception{
        return booksService.delete(booksDto);
    }
    public ArrayList<BooksDto>getAll() throws Exception{
        return booksService.getAll() ;
    }

    public BooksDto get(String book_id) throws Exception{
        return booksService.get(book_id);
    }
}
