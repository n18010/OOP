import java.util.ArrayList;
import java.util.List;
public class BookShelf implements Aggregate {
    //private Book[] books;
    private List<Book> books = new ArrayList<>();
    private int last = 0;
    // コンストラクタ
    // 本棚のサイズを受け取っている
    //public BookShelf(int maxsize) {
    //    this.books = new Book[maxsize];
    //}
    // 任意の位置bookの取得
    public Book getBookAt(int index) {
        //return books[index];
        return books.get(index);
    }
    // 本棚に本を追加
    public void  appendBook(Book book) {
        //this.books[last] = book;
        this.books.add(book);
        last++;
    }
    // 現在の本の数を返す
    public int getLength() {
        return last;
    }

    // イテレータを返す
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
