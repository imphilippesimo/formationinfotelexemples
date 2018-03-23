package com.infotel.springmvc.controller;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.gestionbiblio.dto.BookDto;
import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.mapper.BookMapper;
import com.infotel.gestionbiblio.service.inter.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookMapper  bookMapper;

    @PostMapping("/add")
    public void addBook(@RequestBody BookDto bookDto, HttpServletRequest request) {

	try {

	    // Save the file on the disk
	    // ===================================
	    String imageValue = bookDto.getBase64ImageEncoded();
	    byte[] imageByte = Base64.getDecoder().decode(imageValue);
	    String directory = request.getServletContext().getRealPath("/") + "images/sample.jpg";

	    FileOutputStream fos = new FileOutputStream(directory);
	    fos.write(imageByte);
	    fos.close();
	    // ==============================================

	    // save the book in the DB
	    bookService.insert(bookMapper.dtoToBook(bookDto));

	} catch (Exception e) {
	    // TODO: handle exception
	    e.printStackTrace();
	}

    }

    /*
     * @PostMapping("/update") public void updateBook(@RequestBody BookDto
     * bookDto) { Book book = bookService.getById(bookDto.getIdBook());
     * 
     * 
     * book.setEditor(editorService.getById(bookDto.getIdEditor()));
     * book.setLibrary(libraryService.getById(bookDto.getIdLibrary()));
     * book.setCategory(categoryService.getById(bookDto.getIdCategory()));
     * 
     * List<Author> authors = new ArrayList<Author>(); for (int authorId :
     * bookDto.getIdAuthor()) { authors.add(authorService.getById(authorId)); }
     * book.setAuthor(authors);
     * 
     * List<BookCopy> bookCopies = new ArrayList<BookCopy>(); for (int
     * bookCopiesId : bookDto.getIdBookCopy()) {
     * bookCopies.add(bookCopyService.getById(bookCopiesId)); }
     * book.setBookCopy(bookCopies);
     * 
     * bookService.update(book); }
     */
    @GetMapping("/getlist")
    public List<BookDto> getBooks() {
	List<BookDto> viewBooks = new ArrayList<BookDto>();

	List<Book> books = bookService.getList();

	for (Book book : books) {

	    viewBooks.add(bookMapper.bookToDto(book));
	}

	return viewBooks;
    }

}