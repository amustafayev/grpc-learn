package az.example.org.grpc_struct;

import org.example.grpc.collections.Book;
import org.example.grpc.collections.Library;

public class GrpCollections {

    public static void main(String[] args) {

        Book book1 = Book.newBuilder()
                .setAuthor("Author1")
                .setTitle("Title1")
                .build();


        Book book2 = Book.newBuilder()
                .setAuthor("Author2")
                .setTitle("Title2")
                .build();


        Book book3 = Book.newBuilder()
                .setAuthor("Author3")
                .setTitle("Title3")
                .build();


        Library myLib = Library
                .newBuilder()
                .setName("MyLib")
                .addBooks(book1)
                .addBooks(book2)
                .addBooks(book3)
                .build();

        System.out.println(myLib);

    }
}
