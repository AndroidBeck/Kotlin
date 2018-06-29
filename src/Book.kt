import java.lang.Integer.max
import java.util.*


const val MAX_BOOKS_BORROW = 3

object Constants {
    const val BASE_URL = "http://kotlin.org/books/"
}

open class Book(val title: String, val author:String, val year: Int, var pages: Int = 0) {

    companion object {
        const val BASE_URL = "http://mybookshelf.ru/books/"
    }

    private var currentPage: Int = 1

    open fun readPage() {
        currentPage++
    }

    fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorAndYear(): Triple<String, String, Int> {
        return Triple( title, author, year)
    }

    fun canBorrow(booksBorrowed: Int): Boolean {
        return (booksBorrowed < MAX_BOOKS_BORROW )
    }

    fun printUrl() {
        println(Constants.BASE_URL + title + ".html")
        println(BASE_URL + title + ".html")
    }

}

class eBook(val format: String = "text"): Book("","", 0) {

    var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}

fun Book.getWeight(): Float = pages * 1.5f //gramms

fun Book.tornPages(pagesTorn: Int) {
    pages = max(pages - pagesTorn, 0)
    println("$pagesTorn pages torned :(")
}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(book.pages + 1))
    }
}

fun main(args: Array<String>) {
//    val book = Book("Sobaka_Baskerviley", "A_Conan_Doyle", 1895)
//    println(book.getTitleAndAuthor())
//    val titleAuthorYear = book.getTitleAuthorAndYear()
//    println(titleAuthorYear)
//    println("Here is your book ${titleAuthorYear.first} written by ${titleAuthorYear.second} " +
//            "in ${titleAuthorYear.third}.")
//
//    val allBooks = setOf("Midsummer Dream", "Romeo & Jilette: best shaving for men", "Dont Shake your Spear, dude!",
//            "Hamlet")
//    val library: Map<Set<String>, String> = mapOf(allBooks to "Shakespear")
//    if (library.any {it.key.contains("Hamlet")} ) println("Hamlet is here")
//
//    val moreBooks: MutableMap<String, String> = mutableMapOf("Street paintings" to "Banksi")
//
//    moreBooks.getOrPut("Street Food with Honey") {"Winnie the P."}
//    moreBooks.getOrPut("Jungle Book") {"Kipling"}
//    println(moreBooks)
//
//    println(book.canBorrow(2))
//    book.printUrl()

    var book = Book("Jungle Book", "R. Kipling", 2005, 159)
    println("There are ${book.pages} pages in ${book.title}. Weight = ${book.getWeight()}")
//    book.tornPages(19)
//    println(book.getWeight())

    var smallPuppy = Puppy()
    while (book.pages > 0) {
        smallPuppy.playWithBook(book)
        println("There are ${book.pages} pages in ${book.title}. Weight = ${book.getWeight()}")
    }

}