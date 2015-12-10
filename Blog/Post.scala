class Post(t: String, b: String) {
  private var _title: String = t
  private var _body: String = b
  private var _state: String  = "unpublished"

  private var _author: User = null

  def title   = _title
  def body    = _body
  def state   = _state
  def author  = _author

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

  def author_=(author: User) = {
    _author = author
  }
}
