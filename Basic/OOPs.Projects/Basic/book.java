class Member {
    private String name;
    private String memberId;
    private Map<String, Date> borrowedBooks; // ISBN to due date

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public Map<String, Date> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book, Library library) {
        if (borrowedBooks.size() < 5) {  // Limit to 5 books
            if (book.isAvailable()) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DAY_OF_YEAR, 15); // Book due in 15 days
                Date dueDate = calendar.getTime();
                borrowedBooks.put(book.getIsbn(), dueDate);
                book.setAvailable(false);
                library.updateBookStatus(book);
                System.out.println(name + " borrowed " + book.getTitle() + ", due date: " + dueDate);
            } else {
                System.out.println("Sorry, " + book.getTitle() + " is currently unavailable.");
            }
        } else {
            System.out.println(name + " has already borrowed the maximum of 5 books.");
        }
    }

    public void returnBook(Book book, Library library) {
        if (borrowedBooks.containsKey(book.getIsbn())) {
            borrowedBooks.remove(book.getIsbn());
            book.setAvailable(true);
            library.updateBookStatus(book);
            System.out.println(name + " returned " + book.getTitle() + ".");
        } else {
            System.out.println(name + " has not borrowed " + book.getTitle() + ".");
        }
    }

    public void getBorrowingHistory() {
        System.out.println(name + "'s Borrowing History:");
        for (Map.Entry<String, Date> entry : borrowedBooks.entrySet()) {
            System.out.println("Book ISBN: " + entry.getKey() + ", Due Date: " + entry.getValue());
        }
    }
}
