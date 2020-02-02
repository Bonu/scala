package com.dkatha.osw

object ScalaRunner extends App {
  implicit val books = (new BookStorage()).getBooks
  BooksProcessor.filterByAuthor("Jack London").foreach(b => println(b))
}