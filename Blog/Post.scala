class Post(t: String, b: String) {
  var _title: String = t
  var _body: String = b
  var _state: String  = "unpublished"

  var _author: User = null

  def title()   = _title
  def body()    = _body
  def state()   = _state
  def author()  = _author

  def publish(): Boolean = {

    var published: Boolean = false

    published = if (state == "unpublished") {
      _state = "published"
      true
    } else {
      false
    }

    published
  }

  def setAuthor(author: User): User = {
    _author = author
    _author
  }
}
