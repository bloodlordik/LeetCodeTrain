package transpose_matrix

class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val size = matrix[0].size
        var result = Array<IntArray>(size){index ->
            var newList = mutableListOf<Int>()

               for (i in matrix){
                  newList.add(i[index])
               }
          return@Array newList.toIntArray()
        }
       return result
    }
}

/*
Для того, чтобы транспонировать матрицу достаточно поменять местами столбцы и строки в ней по формуле:
A_{ij} ^T = A_{ji}


 */