import com.sameersoi.LRUCache._
import org.scalatest.FunSuite

class SolutionsSpec extends FunSuite {
  test("Get value from cache") {
    val lru = new LRUCache[String, Int](3)
    
    lru.put("foo", 1)
    lru.put("bar", 2)
    lru.put("baz", 3)
    
    assert(lru.get("baz") === 3)
  }  

  test("Flush least recently used key from cache") {
    val lru = new LRUCache[String, Int](3)
    
    lru.put("foo", 1)
    lru.put("bar", 2)
    lru.get("bar")
    lru.put("baz", 3)
    lru.get("bar")
    lru.put("quux", 4)
    
    assert(lru.get(3) === None)
  }  
}

