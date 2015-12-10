object Blog {
  def main(args: Array[String]){
    println("Blog inits!")

    var userList: List[User] = List()

    for(i <- 0 to 10){
      var _t: User = new User("Name"+i, "email" + i + "@example.com")
      userList = userList :+ _t
    }

    var user = userList.head
    for(i <- 0 to 10){
     var _post: Post = new Post("Title" + i, "Body"+i)
     _post.setAuthor(user)
     user.addPost(_post)
    }

    println("Title \t\t Body")
    for(post <- user.posts){
      println(post.title + "\t\t" + post.body + "\t\t" + user.name )
    }
  }
}
