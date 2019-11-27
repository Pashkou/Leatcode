class Graph :

  def __init__(self): 
      self.numberOfNodes = 0;
      self.adjacentList = {}
      self.allNodes =  {"0": {"1" , "2"}, "1": {"3", "2", "0"} };
  
   
  def addVertex(node):
      pass
   
  def addEdge(node1, node2):
      pass
  
  def showConnections(self):  
      for node in self.allNodes:
          nodeConnections = self.allNodes[node]
          connections = ""
          for vertex in nodeConnections:
              connections += vertex
              print(connections)
      
      
      
myGrapth = Graph()
myGrapth.showConnections()
     
 

