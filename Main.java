// Resource Finder Starter Code              A+CR
class Main {
  public static void main(String[] args) {
    Measure world = new Measure();
		
    for(int r = 0; r < 30; r++){
      for(int c = 0; c < 20; c++){
        // Write your code here.
        double material = world.getMaterial(r, c);
        material = Math.round(material * 100.0) / 100.0;
        System.out.println(material);
       
        // This marks the end of your code segment.
      }
    } 
     /* this code allows the program to finish displaying all the values to the console
     you must press the STOP button to stop the program from running */
     while (true);    
  }
}