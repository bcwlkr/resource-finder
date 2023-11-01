import java.util.Arrays;
// Resource Finder Starter Code              A+CR
class Main {
  public static void main(String[] args) {
    Measure world = new Measure();
		double[] row1 = {};
    for(int r = 0; r < 30; r++){
      for(int c = 0; c < 20; c++){
        // Write your code here.
        double material = world.getMaterial(r, c);
        
        material = Math.round(material * 100.0) / 100.0;
        
        if (material >= 0.34 && material <= 0.56) {
          System.out.println(material + " unpacked snow " + r + " " + " " +c);
        }
        else if (material >= 1.9 && material <= 2.4){
          System.out.println(material + " sed rock " + r + " " + " " +c);
        }
        // This marks the end of your code segment.
      }
    }
    /* this code allows the program to finish displaying all the values to the console
    you must press the STOP button to stop the program from running */
    while (true);
  }
}