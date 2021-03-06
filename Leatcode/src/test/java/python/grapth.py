class Graph :

  def __init__(self): 
      self.numberOfNodes = 0;
      self.adjacentList = {}
      self.allNodes =  {};
  
   
  def addVertex(self, node):
      self.allNodes.update(node)
   
  def addEdge(self, node1, node2):
      nodeConnections = self.allNodes[node1]
      nodeConnections.append(node2)
      
      nodeConnections = self.allNodes[node2]
      nodeConnections.append(node1)
      
  def removeVertex(self, nodeToDelete):
      for node in self.allNodes:
          nodeConnections = self.allNodes[node]
          if nodeToDelete in nodeConnections:
            self.allNodes[node].remove(nodeToDelete)
      del self.allNodes[nodeToDelete]
  
  def showConnections(self):  
      for node in self.allNodes:
          nodeConnections = self.allNodes[node]
          connections = []
          for vertex in nodeConnections:
              connections.append(vertex) 
          print(f"{node} --> {connections}")
  
  def setZeroes(self, m):
      rowZ = False
      colZ = False
      
      for col in m[0]:
          if col == 0:
              colZ = True; break
      
      for row in range(len(m)):
          if m[row][0] == 0:
              rowZ = True; break
      
      for i in range(1,len(m)):
          for j in range(1,len(m[i])):
                if m[i][j] == 0:
                    m[0][j] = -1; m[i][0] = -1
    
      for i in range(1,len(m)):
          for j in range(1,len(m[i])):          
              if m[0][j]==-1 or m[i][0]==-1:
                  m[i][j] = 0
      
      for i in range(len(m[0])):
          if colZ==True:
            m[0][i] = 0
          else: m[0][i] = 1
        
      print(m)     
      for row in range(len(m)):
          if rowZ==True:
             m[row][0] = 0
          else:
             m[row][0] = 1
     
      print(m)
      
myGraph = Graph()
myGraph.setZeroes([[1,1,1],[1,0,1],[1,1,1]])    
     
     
     
      
'''      
myGraph = Graph()
myGraph.addVertex({"0" : []})
myGraph.addVertex({"1" : []})
myGraph.addVertex({"2" : []})
myGraph.addVertex({"3" : []})
myGraph.addVertex({"4" : []})
myGraph.addVertex({"5" : []})
myGraph.addVertex({"6" : []})
myGraph.addEdge('3', '1'); 
myGraph.addEdge('3', '4'); 
myGraph.addEdge('4', '2'); 
myGraph.addEdge('4', '5'); 
myGraph.addEdge('1', '2'); 
myGraph.addEdge('1', '0'); 
myGraph.addEdge('0', '2'); 
myGraph.addEdge('6', '5');

myGraph.removeVertex('2')

myGraph.showConnections()
'''
'''
//Answer:
// 0-->1 2 
// 1-->3 2 0 
// 2-->4 1 0 
// 3-->1 4 
// 4-->3 2 5 
// 5-->4 6 
// 6-->5
'''

     
 

