package com.infotel.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotel.gestionbiblio.dto.BookDto;
import com.infotel.gestionbiblio.entity.Author;
import com.infotel.gestionbiblio.entity.Book;
import com.infotel.gestionbiblio.entity.BookCopy;
import com.infotel.gestionbiblio.service.inter.AuthorService;
import com.infotel.gestionbiblio.service.inter.BookCopyService;
import com.infotel.gestionbiblio.service.inter.BookService;
import com.infotel.gestionbiblio.service.inter.CategoryService;
import com.infotel.gestionbiblio.service.inter.EditorService;
import com.infotel.gestionbiblio.service.inter.LibraryService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	EditorService editorService;

	@Autowired
	LibraryService libraryService;

	@Autowired
	AuthorService authorService;

	@Autowired
	BookCopyService bookCopyService;

	@PostMapping("/add")
	public void addBook(@RequestBody BookDto bookDto) {

		Book book = new Book(bookDto.getISBN(), bookDto.getBookTitre(), bookDto.getBookDescription(),
				bookDto.getImagePath(), bookDto.isPopularBook(), bookDto.isPeriodicBook(), bookDto.getBookPrice(),
				bookDto.getPublicationDate());

		book.setEditor(editorService.getById(bookDto.getIdEditor()));
		book.setLibrary(libraryService.getById(bookDto.getIdLibrary()));
		book.setCategory(categoryService.getById(bookDto.getIdCategory()));

		List<Author> authors = new ArrayList<Author>();
		for (int authorId : bookDto.getIdAuthor()) {
			authors.add(authorService.getById(authorId));
		}
		book.setAuthor(authors);

		List<BookCopy> bookCopies = new ArrayList<BookCopy>();
		for (int authorId : bookDto.getIdBookCopy()) {
			bookCopies.add(bookCopyService.getById(authorId));
		}
		book.setBookCopy(bookCopies);
	}

	@GetMapping("/getlist")
	public List<BookDto> getBooks() {
		List<BookDto> viewBooks = new ArrayList<BookDto>();

		List<Book> books = bookService.getList();

		for (Book book : books) {
			List<Integer> auhtorIds = new ArrayList<Integer>();

			for (Author author : book.getAuthor()) {
				auhtorIds.add(author.getAuthorId());
			}

			List<Integer> bookCopies = new ArrayList<Integer>();

			for (BookCopy bookCopy : book.getBookCopy()) {
				bookCopies.add(bookCopy.getIdBookCopy());
			}
			
			viewBooks.add(new BookDto(book.getISBN(), book.getBookTitre(), book.getBookDescription(),
					book.getImagePath(), book.isPopularBook(), book.isPeriodicBook(), book.getBookPrice(),
					book.getPublicationDate(), book.getCategory().getCategoryId(), book.getEditor().getEditorId(),
					book.getLibrary().getIdLibrary(), bookCopies, auhtorIds));
		}

		return viewBooks;
	}
}
