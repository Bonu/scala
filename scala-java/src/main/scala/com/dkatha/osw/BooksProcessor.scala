package com.dkatha.osw

import java.util
import scala.collection.JavaConversions._


object BooksProcessor {
  def filterByAuthor(author: String)(implicit books: util.ArrayList[Book]) = {
    books.filter(book => book.getAuthor() == "Jack London")
  }
}
