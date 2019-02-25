
/** Cosc 326 Etude 4 "Cubes" This is a test program used to help us understand and identify cube pattenrs
  * Theo Taylor and Angus Reid July 2018 
  */

public class Cubes_test{
  public static void main(String[] args){
    int[][] face = new int[6][4];
    
    int totalo = 0;
    int total = 0;
    String cubes = "00000000";
    
    String binary = "";
    
    
    int cube1 = Integer.parseInt(Character.toString(cubes.charAt(0)));
    int cube2 = Integer.parseInt(Character.toString(cubes.charAt(1)));
    int cube3 = Integer.parseInt(Character.toString(cubes.charAt(2)));
    int cube4 = Integer.parseInt(Character.toString(cubes.charAt(3)));
    int cube5 = Integer.parseInt(Character.toString(cubes.charAt(4)));
    int cube6 = Integer.parseInt(Character.toString(cubes.charAt(5)));
    int cube7 = Integer.parseInt(Character.toString(cubes.charAt(6)));
    int cube8 = Integer.parseInt(Character.toString(cubes.charAt(7)));
    

    
    for (int i=0; i<8; ++i) {
      binary += "0";   
    }
    
    for (int i = 0; i < Math.pow(2,8); i++) {
      if (8-Integer.toBinaryString(i).length() > 0) { 
        cubes = binary.substring(1,8-Integer.toBinaryString(i).length()+1) +Integer.toBinaryString(i);
      } else { 
        cubes = Integer.toBinaryString(i);
      }
      
      cube1 = Integer.parseInt(Character.toString(cubes.charAt(0)));
      cube2 = Integer.parseInt(Character.toString(cubes.charAt(1)));
      cube3 = Integer.parseInt(Character.toString(cubes.charAt(2)));
      cube4 = Integer.parseInt(Character.toString(cubes.charAt(3)));
      cube5 = Integer.parseInt(Character.toString(cubes.charAt(4)));
      cube6 = Integer.parseInt(Character.toString(cubes.charAt(5)));
      cube7 = Integer.parseInt(Character.toString(cubes.charAt(6)));
      cube8 = Integer.parseInt(Character.toString(cubes.charAt(7)));
      
          //cube 1
    //top left face 1
    face[0][0] = cube1;
    
    face[3][1] = face[0][0];
    face[4][2] = face[0][0];
    
    //cube 2
    //top right face 1
    face[0][1] = cube2;
    
    face[1][0] = face[0][1];
    face[4][3] = face[0][1];
     
    //cube 3
    //bottom left face 1
    face[0][2] = cube3;
    
    face[3][3] = face[0][2];
    face[5][0] = face[0][2];
    
    //cube 4
    //bottom right face 1
    face[0][3] = cube4;
    
    face[1][2] = face[0][3];
    face[5][1] = face[0][3];
    
    //cube 5
    //top left face 3
    face[2][0] = cube5;
    
    face[1][1] = face[2][0];
    face[4][1] = face[2][0];
    
    //cube 6
    //top right face 3
    face[2][1] = cube6;
    
    face[4][0] = face[2][1];
    face[3][0] = face[2][1];
     
    //cube 7
    //bottom left face 3
    face[2][2] = cube7;
    
    face[1][3] = face[2][2];
    face[5][3] = face[2][2];
    
    
    //cube 8
    //bottom right face 3
    face[2][3] = cube8;
    
    face[3][2] = face[2][3];
    face[5][2] = face[2][3];
    
    int count = 0;
    
    String[] cubesD = cubes.split("");
    for(int t =0; t < cubesD.length; t++){
      if(Integer.parseInt(Character.toString(cubes.charAt(t)))==0){
      count++;
      }
    }
    
    //counts the total for the combination
    int totalIn = 0;
    //creates divider based on number of 0 and 1 combination
     if(count==2){
      System.out.println("-------------\n\n");
      total++;
     }
      for (int x = 0; x < face.length; ++x) {
        //only displays cubes based on number of 1s and 0s (so yellow and blue) 
        // the count only counts 1 number in this case 0s so we show both 3 and 5 
        if(count==2) {
        System.out.print("Face " + x + " =   ");  
        totalIn = 0;
        for(int y = 0; y < face[x].length; ++y) {
          if(face[x][y]==1){
            totalIn++;
          }
          if(totalIn==4){
            totalo++;
          }
          System.out.print(face[x][y]+ " ");
          
          if(y==face[x].length-1){
            System.out.println("");
          }
        }
      }
      }
    }
    
    
    
    System.out.println("Total= " + total);
     //System.out.println("Total of all 1's= " + totalo);
    
  
  
  
  }
}