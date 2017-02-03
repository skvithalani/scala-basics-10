package asynchrony

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationDouble

object App1 extends App {

  def square(x: Int): Future[Int] = Future {
    Thread.sleep(2000)
    println("running the square")
    x * x
  }

  def double(x: Int): Future[Int] = Future {
    Thread.sleep(2000)
    println("running the double")
    x + x
  }

  val f1: Future[Int] = square(10)
  val f2: Future[Int] = double(11)

  private val f4 = f1.map(x => x + 1)

  val f3: Future[Int] = f1.flatMap { v1 =>
    f2.map { v2 =>
      println("composing")
      v1 + v2
    }
  }


  println("call returns")

  private val result = {
                          println("In await")
                          val result = Await.result(f3, 10.seconds)
                          println("after await")
                          result
                        }

  println(result)
}
