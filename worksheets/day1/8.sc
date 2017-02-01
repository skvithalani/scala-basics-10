
val xs = List(1, 2, 3, 4)

xs.foldLeft(0)((acc, elm) => acc + elm)
xs.sum
xs.foldLeft(1)((acc, elm) => acc * elm)
xs.foldLeft("")((acc, elm) => acc + elm)

xs.map(x => x + 1)
xs.map(_ + 1)

xs.foldLeft(1)((acc, elm) => acc * elm)
xs.foldLeft(1)(_ * _)

