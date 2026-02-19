class Book{
    static int TotalNoOfBooks;
    String BookName;
    String AuthorName;
    String isbn;
    boolean isBorrowed;
    static{
       TotalNoOfBooks=0;
    }
    {
        TotalNoOfBooks++;
    }
    Book(String BookName,String AuthorName,String isbn){
        this.BookName=BookName;
        this.AuthorName=AuthorName;
        this.isbn=isbn;

    }
    Book(String isbn){
        this(isbn,"Unknown","Unkonwn");

    }
    static int getTotalNoOfBooks(){
        return TotalNoOfBooks;
    }
    void BorrowBook(){
        if(isBorrowed){
            System.out.println("Sorry, this book is already borrowed."+this.BookName);
            
        }else{
            this.isBorrowed=true;
            System.out.println("You have successfully borrowed the book: "+this.BookName);
        }
    }
     void ReturnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("You have successfully returned the book: "+this.BookName);
        }else{
            System.out.println("This book was not borrowed.");
        }
    }
    public static void main(String args[]){
        Book book1=new Book("The Alchemist","Paulo Coelho","978-0061122415");
        Book book2=new Book("Ikigai","Héctor García & Francesc Miralles","978-0143129750");
        System.out.println("Total number of books in the library: "+Book.getTotalNoOfBooks());
        book1.BorrowBook();
        book2.BorrowBook();
        book1.ReturnBook();
        book2.BorrowBook();
        book2.ReturnBook();
    }
}