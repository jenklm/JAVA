package Q7;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();  // Book ��ü ����
        book.setTitle("Title of Book");
        book.setAuthor("Author of Book");
        System.out.println("title : "+ book.getTitle());
        System.out.println("author : " + book.getAuthor());
   }
}
