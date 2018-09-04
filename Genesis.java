import java.util.*;

public class Genesis{
public class Gnode{
String date;
Date timestamp=new Date();
String data;
int nodeNumber;
String nodeId;
String referenceNodeId;
String childReferenceNodeId;
String genesisReferenceNodeId;
String hashValue;

Scanner s=new Scanner(System.in);

public Gnode(int nodeNumber){
this.data=data;
this.nodeNumber=nodeNumber;
this.nodeId=nodeId;
this.referenceNodeId=referenceNodeId;
}
public genesis(){
  this.genesis=null;
    
    
}
public parentNode(int nodeNumber){
    return nodeNumber;
    
    
    
}

public childNode(int nodeNumber){
    
    Gnode node=new Gnode(nodeNumber);
    if(genesis==null){
        genesis=node;
        node.data=s.nextline();
        node.nodeId="0000";
        return genesis;
    }
    else{
        
        if(node.nodeNumber<genesis.nodeNumber){
            Node temp=childNode(genesis.childReference);
            
        }
        else{
            return genesis;
        }
        
    }
    
}
public void childNode(){
    genesis=childNode(genesis);
}
     public static void main(String []args){
        
     }
}
}