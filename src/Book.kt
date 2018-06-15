open class Book(val title: String, val author:String) {

    private var currentPage: Int = 1

    open fun readPage() {
        currentPage++
    }
}

class eBook(val format: String = "text"): Book("","") {

    var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}
