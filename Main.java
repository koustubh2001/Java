import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }   

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

class Member {
    private String name;
    private String id;
    private List<Book> borrowedBooks;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public boolean canBorrow() {
        return borrowedBooks.size() < 5;
    }

    public void borrowBook(Book book) {
        if (canBorrow() && book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}

class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getISBN(), book);
    }

    public void removeBook(String ISBN) {
        books.remove(ISBN);
    }

    public Book searchBook(String ISBN) {
        return books.get(ISBN);
    }

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public void removeMember(String id) {
        members.remove(id);
    }

    public Member searchMember(String id) {
        return members.get(id);
    }

    public void borrowBook(String memberId, String ISBN) {
        Member member = searchMember(memberId);
        Book book = searchBook(ISBN);
        if (member != null && book != null && book.isAvailable() && member.canBorrow()) {
            member.borrowBook(book);
        }
    }

    public void returnBook(String memberId, String ISBN) {
        Member member = searchMember(memberId);
        Book book = searchBook(ISBN);
        if (member != null && book != null) {
            member.returnBook(book);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", members=" + members +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("John Doe", "1");
        Member member2 = new Member("Jane Smith", "2");

        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook("1", "1234567890");
        library.borrowBook("2", "0987654321");

        System.out.println(library);

        library.returnBook("1", "1234567890");
        library.returnBook("2", "0987654321");

        System.out.println(library);
    }
}