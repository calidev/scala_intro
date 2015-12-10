class User(n: String, e: String) {
  var _name: String    = n
  var _email: String   = e



  def addPost(post: Post): List[Post] = {
    _posts = _posts :+ post
    _posts
  }

  def name() = _name
  def email() = _email
  def posts() = _posts

  private var _posts: List[Post] = List()
}
