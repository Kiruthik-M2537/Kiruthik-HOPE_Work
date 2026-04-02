package Day9;
import java.util.*;
public class ZigZag6{
public static void main(String[] args) {
    String s="PAYPALISHIRING";
    int numRows=3;

if(numRows==1)
{
    System.out.println(s);
}
ArrayList<StringBuilder> rows=new ArrayList<>();
for(int i=0;i<numRows;i++){
    rows.add(new StringBuilder());
}
int currentRows=0;
Boolean goingDown=false;
for(char c:s.toCharArray()){
    rows.get(currentRows).append(c);

    if(currentRows==0 || currentRows==numRows-1){
        goingDown=!goingDown;
    }
    if(goingDown){
        currentRows++;
    }
    
    else {
        currentRows--;  
    }
    
}
StringBuilder result=new StringBuilder();
for(StringBuilder row:rows){
    result.append(row);
}
System.out.println(result.toString());
}
}
