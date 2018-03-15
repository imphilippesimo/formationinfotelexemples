package com.infotel.gestionbiblio.dto;

import java.util.Date;
import java.util.List;


public class BookDto 
{
	//Attibuts simple
	private int ISBN;
	private String bookTitre, bookDescription, imagePath;
	private boolean popularBook, periodicBook;
	private float bookPrice;
	private Date publicationDate;

	//Id attributs complexes
	private int categoryId;
	private int editorId;
	private int idLibrary;
	private List<Integer> idBookCopy;
	private List<Integer> authorIds;
	
	public BookDto() 
	{
		super();
	}
	public BookDto(int iSBN, String bookTitre, String bookDescription, String imagePath, boolean popularBook,
			boolean periodicBook, float bookPrice, Date publicationDate, int idCategory, int idEditor, int idLibrary,
			List<Integer> idBookCopy, List<Integer> idAuthor) 
	{
		super();
		this.ISBN = iSBN;
		this.bookTitre = bookTitre;
		this.bookDescription = bookDescription;
		this.imagePath = imagePath;
		this.popularBook = popularBook;
		this.periodicBook = periodicBook;
		this.bookPrice = bookPrice;
		this.publicationDate = publicationDate;
		this.categoryId = idCategory;
		this.editorId = idEditor;
		this.idLibrary = idLibrary;
		this.idBookCopy = idBookCopy;
		this.authorIds = idAuthor;
	}
	
	public BookDto(int iSBN, String bookTitre, String bookDescription, String imagePath, boolean popularBook,
			boolean periodicBook, float bookPrice, Date publicationDate, int categoryId, int editorId, int idLibrary) {
		super();
		ISBN = iSBN;
		this.bookTitre = bookTitre;
		this.bookDescription = bookDescription;
		this.imagePath = imagePath;
		this.popularBook = popularBook;
		this.periodicBook = periodicBook;
		this.bookPrice = bookPrice;
		this.publicationDate = publicationDate;
		this.categoryId = categoryId;
		this.editorId = editorId;
		this.idLibrary = idLibrary;
	}
	

	public int getISBN() {
		return this.ISBN;
	}
	public void setISBN(int iSBN) {
		this.ISBN = iSBN;
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
	public boolean isPeriodicBook() {
		return periodicBook;
	}
	public void setPeriodicBook(boolean periodicBook) {
		this.periodicBook = periodicBook;
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
	public int getIdCategory() {
		return categoryId;
	}
	public void setIdCategory(int idCategory) {
		this.categoryId = idCategory;
	}
	public int getIdEditor() {
		return editorId;
	}
	public void setIdEditor(int idEditor) {
		this.editorId = idEditor;
	}
	public int getIdLibrary() {
		return idLibrary;
	}
	public void setIdLibrary(int idLibrary) {
		this.idLibrary = idLibrary;
	}
	public List<Integer> getIdBookCopy() {
		return idBookCopy;
	}
	public void setIdBookCopy(List<Integer> idBookCopy) {
		this.idBookCopy = idBookCopy;
	}
	public List<Integer> getIdAuthor() {
		return authorIds;
	}
	public void setIdAuthor(List<Integer> idAuthor) {
		this.authorIds = idAuthor;
	}
}
