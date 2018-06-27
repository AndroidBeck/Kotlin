open class Book(val title: String, val author:String, val year: Int) {

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
}

class eBook(val format: String = "text"): Book("","", 0) {

    var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}

fun main(args: Array<String>) {
    val book = Book("Sobaka Baskerviley", "A.Conan Doyle", 1895)
    println(book.getTitleAndAuthor())
    val titleAuthorYear = book.getTitleAuthorAndYear()
    println(titleAuthorYear)
    println("Here is your book ${titleAuthorYear.first} written by ${titleAuthorYear.second} " +
            "in ${titleAuthorYear.third}.")

    val allBooks = setOf("Midsummer Dream", "Romeo & Jilette: best shaving for men", "Dont Shake your Spear, dude!",
            "Hamlet")
    val library: Map<Set<String>, String> = mapOf(allBooks to "Shakespear")
    if (library.any {it.key.contains("Hamlet")} ) println("Hamlet is here")

    val moreBooks: MutableMap<String, String> = mutableMapOf("Street paintings" to "Banksi")

    moreBooks.getOrPut("Street Food with Honey") {"Winnie the P."}
    moreBooks.getOrPut("Jungle Book") {"Kipling"}
    println(moreBooks)

}