 class Matrix :
 
     def setZeroes(self, matrix):
         
         row = matrix[1]
         for i in range(len(row)):
             print(row[i])

setZeroes([
  [1,1,1],
  [1,0,1],
  [1,1,1]
])