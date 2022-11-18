package Taskjson;

public class Books {
    String bookName;
    String author;
    String edition;
    String pros;
    String cons;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPros() {
        return pros;
    }

    public void setPros(String pros) {
        this.pros = pros;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    @Override
    public String toString() {
              return "Book{" +
                    "bookName = " + bookName + '\'' +
                    ", author = " + author + '\'' +
                    ", edition = " + edition + '\'' +
                      ", pros = " + pros + '\'' +
                      ", Cons = " + cons +
                    '}';



    }
}


