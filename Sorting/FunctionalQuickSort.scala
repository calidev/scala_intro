object FunctionalQuickSort {
  def sortVerbose(xs: Array[Int]): Array[Int] = {

    if (xs.length <= 1){
      xs
    } else {

      val pivot = xs(xs.length / 2)
      var lessThan: Array[Int] = sort(xs.filter(x => pivot > x))

      println("Less than pivot: " +  pivot)
      for (i <- lessThan) {
        print(i + " ")
      }
      println()

      var equalTo: Array[Int] = xs.filter(x => pivot == x)

      println("Equal to  pivot: " +  pivot)
      for (i <- equalTo) {
        print(i + " ")
      }

      println()

      var greatThan: Array[Int] = sort(xs.filter(x => pivot < x))

      println("Greater than pivot: " +  pivot)
      for (i <- greatThan) {
        print(i + " ")
      }

      println()

      Array.concat( lessThan, equalTo, greatThan )
    }


  }

  def sortHumanReadable(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) {
      xs
    } else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        sort(xs.filter( x => pivot > x)),
        xs.filter(x => pivot == x),
        sort(xs.filter(x => pivot < x))
      )
    }
  }

  def sort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        sort(xs filter (pivot >)),
        xs filter (pivot ==),
        sort(xs filter (pivot <))
      )
    }
  }
}
