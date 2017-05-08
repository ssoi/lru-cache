package com.sameersoi.LRUCache

import scala.collection.mutable.Map

class LRUCache[T, U](capacity: Int) {
  val kvStore = new Map[T, U]()

  def get(key: T): Option[U] = kvStore.get(key)
  
  def put(key: T, value: U): Unit = ???
}
