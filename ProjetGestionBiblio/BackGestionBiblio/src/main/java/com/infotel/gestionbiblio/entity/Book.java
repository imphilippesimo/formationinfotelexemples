package com.infotel.gestionbiblio.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
    //@NamedQuery(name="member.isAdmin", query="FROM Member WHERE administrateur=1 AND memberEmail=:email AND memberPassword=:password"),
    //@NamedQuery(name="member.isMember", query="FROM Member WHERE administrateur=0 AND memberEmail=:email AND memberPassword=:password")
	//@NamedQuery(name="book.selectCatRecommended", query="FROM Book b,Catalog c WHERE catalog=recommended")non
	//@NamedQuery(name="book.listOrderAlpha", query="from Book order by publicationDate ASC")
	@NamedQuery(name="book.selectPopular", query="FROM book WHERE popularBook=true"),
	@NamedQuery(name="book.selectRecommandes", query="FROM book WHERE catalog.catalogName='recommandés'")
})
//@NamedQuery(name="book.listOrderRecent", query="from Book order by publicationDate ASC")
public class Book  implements Serializable
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBook;
	private static final long serialVersionUID = 1L;
	private int ISBN;
	private String bookTitre, bookDescription, imagePath;
	private boolean popularBook, periodicBook;
	private float bookPrice;
	private Date publicationDate;

	@ManyToOne
	private Category category;
	@ManyToOne
	private Editor editor;
	@ManyToOne
	private Catalog catalog;
	@OneToMany(mappedBy = "book")
	private List<BookCopy> bookCopy;
	@ManyToMany
	private List<Author> author = new ArrayList<Author>();

	public Book() {
		// TODO Auto-generated constructor stub
	}

	

	public Book(int iSBN, String bookTitre, String bookDescription, String imagePath, boolean popularBook,
			boolean periodicBook, float bookPrice, Date publicationDate, Category category, Editor editor,
			Catalog catalog, List<BookCopy> bookCopy, List<Author> author) {
		ISBN = iSBN;
		this.bookTitre = bookTitre;
		this.bookDescription = bookDescription;
		this.imagePath = imagePath;
		this.popularBook = popularBook;
		this.periodicBook = periodicBook;
		this.bookPrice = bookPrice;
		this.publicationDate = publicationDate;
		this.category = category;
		this.editor = editor;
		this.catalog = catalog;
		this.bookCopy = bookCopy;
		this.author = author;
	}



	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getBookTitre() {
		return bookTitre;
	}

	public void setBookTitre(String bookTitre) {
		this.bookTitre = bookTitre;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public boolean isPopularBook() {
		return popularBook;
	}

	public void setPopularBook(boolean popularBook) {
		this.popularBook = popularBook;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public List<BookCopy> getBookCopy() {
		return bookCopy;
	}

	public void setBookCopy(List<BookCopy> bookCopy) {
		this.bookCopy = bookCopy;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}

	public int getIdBook() {
		return idBook;
	}



	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}



	public boolean isPeriodicBook() {
		return periodicBook;
	}



	public void setPeriodicBook(boolean periodicBook) {
		this.periodicBook = periodicBook;
	}



	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", bookTitre=" + bookTitre + ", bookDescription=" + bookDescription
				+ ", imagePath=" + imagePath + ", popularBook=" + popularBook + ", periodicBook=" + periodicBook
				+ ", bookPrice=" + bookPrice + ", publicationDate=" + publicationDate + ", category=" + category
				+ ", editor=" + editor + ", catalog=" + catalog + ", bookCopy=" + bookCopy + ", author=" + author + "]";
	}



	

}
