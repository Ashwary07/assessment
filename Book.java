/**
 * A book should have these
 - ISBN
 - Title
 - Year of Publish
 - Author Name (upto 3) 
 - Their Nationality
 - Their Year of Birth
 - A book can have multiple authors
   but no more than 3.
 */

public class Book  {
    private String title;
    private String ISBN;
    private int yearOfPublish;
    private Author[] authors;
    private int authorCount;

    public Book(String pTitle, String pISBN, int pYearOfPublish, Author[] authors) {
        title = pTitle;
        ISBN = pISBN;
        yearOfPublish = pYearOfPublish;
        authors = new Author[3];
        authorCount = 0;
    }

    public String getTitle() {return title;}

    public String getISBN() {return ISBN;}

    public int getYearOfPublish() {return yearOfPublish;}

    public int getAuthorCount() {return authorCount;}

    public Author[] getAllAuthors () {return authors;}

    // public Author getSpecificAuthor(String authorName) {
    //     for (int i = 0 ; i < authors.length(); i++) {
    //         if (authors[i].getAllAuthors().equalsIgnoreCase(authorName)) {
    //             return authors[i];
    //         }
    //     }
    // }

    public void addAuthor(Author author) {
        if (authorCount < 3) {
            authors[authorCount] = author;
            authorCount++;
        } else {
            throw new IllegalStateException("A book can have no more than 3 authors.");
        }
    }

    public void setTitle(String pTitle) {title = pTitle;}
    
    public void setISBN(String pISBN) {ISBN = pISBN;}

    public void setYearOfPublish (int pYearOfPublish) {yearOfPublish = pYearOfPublish;}

    public void setAuthor (String authors) {
        
    }
    

}

class Author {

}