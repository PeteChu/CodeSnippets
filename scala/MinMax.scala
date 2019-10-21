package minmax

object MinMax {

  // recusion
  def Min(list: Array[Int]): Int = {
    def iter(start: Int, size: Int, min: Int): Int = {
      if (start > size) min
      else
        iter(
          start + 1,
          size,
          if (list.apply(start) < min) list.apply(start) else min
        )
    }
    iter(0, list.size, list.apply(0))
  }

  // recusion
  def Max(list: Array[Int]): Int = {
    def iter(start: Int, size: Int, max: Int): Int = {
      if (start > size) min
      else
        iter(
          start + 1,
          size,
          if (list.apply(start) > max) list.apply(start) else max
        )
    }
    iter(0, list.size, list.apply(0))
  }

}
